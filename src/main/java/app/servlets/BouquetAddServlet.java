//package app.servlets;
//
//import app.dao.BouquetDao;
//import app.entity.Bouquet;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.SQLException;
//
//@WebServlet("/bouquet")
//public class BouquetAddServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/bouquet.jsp");
//        requestDispatcher.forward(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String name = req.getParameter("bouquetName");
//        String price = req.getParameter("bouquetPrice");
//
//
//        Bouquet bouquet = new Bouquet ( name,Integer.parseInt(price));
//        BouquetDao bouquetDao = new BouquetDao();
//        try {
//            bouquetDao.add(bouquet);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        req.setAttribute("bouquet", bouquet);
//        doGet(req, resp);
//
//    }
//}
