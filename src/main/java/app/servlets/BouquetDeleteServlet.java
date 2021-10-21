package app.servlets;

import app.dao.BouquetDao;
import app.entity.Bouquet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/deleteBouquet")
public class BouquetDeleteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/bouquetDelete.jsp");
//        requestDispatcher.forward(request, response);
        String bouquetIdString = request.getParameter("BouquetIdParam");
      int bouquetId=Integer.parseInt(bouquetIdString);
        BouquetDao bouquetDao = new BouquetDao();
        try {
            bouquetDao.deleteById(bouquetId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("bouquetList");

    }}

//        @Override
//        protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            String id = req.getParameter("bouquetId");
//            String name = req.getParameter("bouquetName");
//            String price = req.getParameter("bouquetPrice");
//
//
//            Bouquet bouquet = new Bouquet(Integer.parseInt(id), name, Integer.parseInt(price));
//            BouquetDao bouquetDao = new BouquetDao();
//            try {
//                bouquetDao.delete(bouquet);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//            req.setAttribute("bouquet", bouquet);
//            doGet(req, resp);
//
//        }
//    }
