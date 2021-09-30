package app.servlets;

import app.dao.BouquetDao;
import app.entity.Bouquet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/")
public class BouquetAddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/views/bouquet.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bouquetName = req.getParameter("BOUQUETNAME");
        String bouquetPrice = req.getParameter("BOUQUETPRICE");



       String name = bouquetName;
        int price= Integer.parseInt(bouquetPrice);

        Bouquet bouquet = new Bouquet(name,price);

        BouquetDao bouquetDao = new BouquetDao();
        try {
            bouquetDao.add(bouquet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        resp.sendRedirect("bouquetList");
    }
}