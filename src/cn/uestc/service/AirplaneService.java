package cn.uestc.service;


import cn.uestc.pojo.Airplane;

import java.util.List;

public interface AirplaneService {
    /**
     * 查询所有飞机的信息和落地起飞机场
     * @param takeid
     * @param landid
     * @return
     */
    List<Airplane> showAirplaneAndAirport(int takeid, int landid);
}
