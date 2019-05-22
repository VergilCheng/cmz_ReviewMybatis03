package cn.uestc.mapper;

import cn.uestc.pojo.Airplane;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirplaneMapper {
    List<Airplane> selByTakeIdLandId(@Param("takeId") int takeid,
                                     @Param("landId") int landid);
}
