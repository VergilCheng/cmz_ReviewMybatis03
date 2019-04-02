package cn.uestc.mapper;

import cn.uestc.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: cmz
 * @Date: 2019/4/2
 * @Description: cn.uestc.mapper
 * @version: 1.0
 */
public interface StudentMapper {
    /*使用AutoMapping以及select标签注解来实现多表查询*/
    @Select("select " +
            "s.name name," +
            "s.id id, " +
            "s.age age," +
            "s.tid tid," +
            "t.id `teacher.id`," +
            "t.name `teacher.name`" +
            " from student s " +
            "left join teacher t " +
            "on t.id=s.tid")
    List<Student> selAll();

    @Select("select * from student where tid=#{0}")
    List<Student> selByTid(int tid);


}
