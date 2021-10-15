package app.servlets;

import app.dao.BouquetDao;
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


@WebServlet("/userAdd")
public class UserAddServlet extends HttpServlet{

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/userAdd.jsp");
            requestDispatcher.forward(request, response);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String name = req.getParameter("userName");
            String email = req.getParameter("email");
            String role = req.getParameter("userRole");
            String password = req.getParameter("password");


            User user= new User ( name, password,email,role);
            UserDao userDao=new UserDao();
            try {
                userDao.add(user);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            req.setAttribute("user", user);
            doGet(req, resp);

        }
    }

