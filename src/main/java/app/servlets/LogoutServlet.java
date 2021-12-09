package app.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/views/loginView.jsp").forward(request, response);

        HttpSession session=request.getSession();
        session.invalidate();

        System.out.println("You are successfully logged out!");

    }
}