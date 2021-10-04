package app.servlets;

import app.Util.Util;
import app.dao.BouquetDao;
import app.entity.Bouquet;
import app.service.BouquetService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BouquetListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BouquetDao bouquetDao = new BouquetDao();
        List<Bouquet> bouquetList = null;
        try {
            bouquetList = bouquetDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("bouquetList", bouquetList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/bouquetList.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doPost(req,resp);
    }
}