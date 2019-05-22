package cn.uestc.servlet;

import cn.uestc.pojo.Airplane;
import cn.uestc.service.AirplaneService;
import cn.uestc.service.impl.AirplaneServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: cmz
 * @Date: 2019/5/22
 * @Description: cn.uestc.servlet
 * @version: 1.0
 */
@WebServlet("/showairplane")
public class showAirplaneAndAirport extends HttpServlet {
    private AirplaneService airplaneService = new AirplaneServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int takeid = 0;
        String takeIdStr = req.getParameter("takeid");
        if (takeIdStr != null && !takeIdStr.equalsIgnoreCase("")) {
            takeid = Integer.parseInt(takeIdStr);
        }
        int landid = 0;
        String landIdStr = req.getParameter("landid");
        if (landIdStr != null && !landIdStr.equalsIgnoreCase("")) {
            landid = Integer.parseInt(landIdStr);
        }
        List<Airplane> airplanes = airplaneService.showAirplaneAndAirport(takeid, landid);
        req.setAttribute("airplanes", airplanes);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
