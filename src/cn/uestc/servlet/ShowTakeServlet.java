package cn.uestc.servlet;

import cn.uestc.pojo.Airport;
import cn.uestc.service.AirportSerivce;
import cn.uestc.service.impl.AirportSerivceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: cmz
 * @Date: 2019/5/22
 * @Description: cn.uestc.servlet
 * 显示起飞机场信息的serlvet
 * @version: 1.0
 */
@WebServlet("/showtake")
public class ShowTakeServlet extends HttpServlet {

    private AirportSerivce airportSerivce = new AirportSerivceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        req.setAttribute("takeport", airportSerivce.showTakePort());
        req.getRequestDispatcher("showLand").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}

