package cn.uestc.mapper;

import cn.uestc.pojo.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Mybatis注解开发，不使用mapper.xml文件，但是可以与mapper.xml文件开发模式共存
 */
public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> selAll();

    @Insert("insert into teacher values(default,#{name})")
    int insertTeacher(Teacher teacher);

    @Update("update teacher set name=#{name} where id=#{id}")
    int updateTeacher(Teacher teacher);

    @Delete("delete from teacher where id=#{id}")
    int deleteTeacher(int id);

    /*使用注解实现多表查询，不如mapper.xml书写简便*/
    @Results(
            value = {@Result(id=true,property = "id",column = "id"),
                     @Result(property = "name",column = "name"),
                     @Result(property = "list",column = "id",
                             many = @Many(select = "cn.uestc.mapper.StudentMapper.selByTid"))
                     })
    @Select("select * from teacher")
    List<Teacher> selTeachers();

}
