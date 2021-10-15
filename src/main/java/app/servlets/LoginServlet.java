package app.servlets;

import app.Util.AppUtils;
import app.dao.UserDao;
import app.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/userInfo.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = null;
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();
        try {


            user = userDao.findUser(userName, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (user == null) {
            String errorMessage = "Invalid userName or Password";
            request.setAttribute("errorMessage", errorMessage);
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/loginView.jsp");
            dispatcher.forward(request, response);
            return;
        }
        try {
            user = userDao.getUserByName(userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String userRole = user.getUserRole();

        String name = user.getUserName();
        if (userName.equals(name)) {
            AppUtils.storeLoginedUser(request.getSession(), user);
            int redirectId = -1;

            try {
                redirectId = Integer.parseInt(request.getParameter("redirectId"));
            } catch (Exception e) {
            }
          //  String requestUri = AppUtils.getRedirectAfterLoginUrl(request.getSession(), redirectId);

//            if (requestUri != null) {
//                response.sendRedirect(requestUri);
//            } else {
//                response.sendRedirect(request.getContextPath() + "/views/userInfo.jsp");
//            }
            if (userRole.equals("admin")) {
                request.getRequestDispatcher("indexAdmin.jsp").forward(request, response);
            } else request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        }}



