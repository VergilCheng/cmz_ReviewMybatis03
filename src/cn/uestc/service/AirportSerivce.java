package cn.uestc.service;

import cn.uestc.pojo.Airport;

import java.util.List;

public interface AirportSerivce {
    /**
     * 显示所有起飞机场
     * @return
     */
    List<Airport> showTakePort();

    /**
     * 显示所有降落机场
     * @return
     */
    List<Airport> showLandPort();
}
