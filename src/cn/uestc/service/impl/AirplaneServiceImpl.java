package cn.uestc.service.impl;

import cn.uestc.mapper.AirplaneMapper;
import cn.uestc.pojo.Airplane;
import cn.uestc.service.AirplaneService;
import cn.uestc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Auther: cmz
 * @Date: 2019/5/22
 * @Description: cn.uestc.service.impl
 * @version: 1.0
 */
public class AirplaneServiceImpl implements AirplaneService {
    @Override
    public List<Airplane> showAirplaneAndAirport(int takeid, int landid) {
        SqlSession session = MybatisUtil.getSession();
        AirplaneMapper mapper = session.getMapper(AirplaneMapper.class);
        List<Airplane> airplanes = mapper.selByTakeIdLandId(takeid, landid);
        return airplanes;
    }
}
