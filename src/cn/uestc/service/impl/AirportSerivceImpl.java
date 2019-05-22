package cn.uestc.service.impl;

import cn.uestc.mapper.AirportMapper;
import cn.uestc.pojo.Airport;
import cn.uestc.service.AirportSerivce;
import cn.uestc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Auther: cmz
 * @Date: 2019/5/22
 * @Description: cn.uestc.service.impl
 *
 * @version: 1.0
 */
public class AirportSerivceImpl implements AirportSerivce {

    @Override
    public List<Airport> showTakePort() {
        SqlSession session = MybatisUtil.getSession();
        AirportMapper airportMapper = session.getMapper(AirportMapper.class);
        List<Airport> airports = airportMapper.showTakePort();
        System.out.println(airports);
        return airports;
    }

    @Override
    public List<Airport> showLandPort() {
        SqlSession session = MybatisUtil.getSession();
        AirportMapper airportMapper = session.getMapper(AirportMapper.class);
        List<Airport> airports = airportMapper.showLandPort();
        System.out.println(airports);
        return airports;
    }

}
