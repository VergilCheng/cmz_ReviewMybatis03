package cn.uestc.mapper;

import cn.uestc.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AirportMapper {
    /**
     * 查询起飞机场
     * @return
     */
    @Select("select * from airport where id in (select distinct takeid from airplane)")
    List<Airport> showTakePort();
    /**
     * 查询降落机场
     */
    @Select("select * from airport where id in (select distinct landid from airplane)")
    List<Airport> showLandPort();
}
