//package app.servlets;
//
//
//import app.Util.MyUtils;
//import app.Util.Util;
//import app.dao.UserDao;
//import app.entity.User;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//
//@WebServlet("/login")
//public class UserLoginServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public UserLoginServlet() {
//        super();
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/loginView.jsp");
//        dispatcher.forward(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String userName = request.getParameter("userName");
//        String password = request.getParameter("password");
////        String email = request.getParameter("email");
//        String rememberMeStr = request.getParameter("rememberMe");
//        boolean remember = "Y".equals(rememberMeStr);
//
//        System.out.println(userName);
//        System.out.println(password);
//
//        User user = null;
//        boolean hasError = false;
//        String errorString = null;
//
//        if (userName == null || password == null  || userName.length() == 0 || password.length() == 0
//        ) {
//            hasError = true;
//            errorString = "Required username and password!";
//            System.out.println("error");
//        }
//        else {
//            Connection conn = MyUtils.getStoredConnection(request);
//            try {
//                // Найти user в DB.
//                user = UserDao.findUser(userName, password);
//
//                if (user == null) {
//                    hasError = true;
//                    errorString = "User Name or password invalid";
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//                hasError = true;
//                errorString = e.getMessage();
//            }
//        }
//        // В случае, если есть ошибка,
//        // forward (перенаправить) к /login.jsp
//        if (hasError) {
//            user = new User();
//            user.setUserName(userName);
//            user.setPassword(password);
//            //           user.setEmail(email);
//
//            // Сохранить информацию в request attribute перед forward.
//            request.setAttribute("errorString", errorString);
//            request.setAttribute("user", user);
//
//            // Forward (перенаправить) к странице /login.jsp
//            RequestDispatcher dispatcher //
//                    = this.getServletContext().getRequestDispatcher("/views/loginView.jsp");
//
//            dispatcher.forward(request, response);
//        }
//        // В случае, если нет ошибки.
//        // Сохранить информацию пользователя в Session.
//        // И перенаправить к странице userInfo.
//        else {
//            HttpSession session = request.getSession();
//            MyUtils.storeLoginedUser(session, user);
//
//            // Если пользователь выбирает функцию "Remember me".
//            if (remember) {
//                MyUtils.storeUserCookie(response, user);
//                System.out.println("remember");
//            }
//            // Наоборот, удалить Cookie
//            else {
//                MyUtils.deleteUserCookie(response);
//                System.out.println("don't remember");
//            }
//
//            // Redirect (Перенаправить) на страницу /userInfo.
//            response.sendRedirect("http://localhost:8081/index.jsp");
//
//        }
//    }
//}