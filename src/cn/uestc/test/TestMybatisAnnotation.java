package cn.uestc.test;

import cn.uestc.mapper.StudentMapper;
import cn.uestc.mapper.TeacherMapper;
import cn.uestc.pojo.Student;
import cn.uestc.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Auther: cmz
 * @Date: 2019/4/2
 * @Description: cn.uestc.test
 *
 * 测试mybatis注解开发
 *
 * @version: 1.0
 */
public class TestMybatisAnnotation {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    /**
     * 测试select注解
     */
    @Test
    public void test01() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.selAll();
        for (Teacher t :
                teachers) {
            System.out.println(t);
        }
    }
    /**
     * 测试insert注解
     */
    @Test
    public void test02() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = new Teacher();
        teacher.setName("老师4");
        int i = teacherMapper.insertTeacher(teacher);
        sqlSession.commit();
        System.out.println(i);
    }
    /**
     * 测试update注解
     */
    @Test
    public void test03() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = new Teacher();
        teacher.setName("张三");
        teacher.setId(3);
        int i = teacherMapper.updateTeacher(teacher);
        sqlSession.commit();
        System.out.println(i);
    }
    /**
     * 测试delete注解
     */
    @Test
    public void test04() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        int id = 4;
        int i = teacherMapper.deleteTeacher(id);
        sqlSession.commit();
        System.out.println(i);
    }
    /**
     * 测试select注解进行多表查询
     */
    @Test
    public void test05() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.selAll();
        for (Student s :
                students) {
            System.out.println(s);
        }
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.selTeachers();
        for (Teacher t :
                teachers) {
            System.out.println(t);
        }
    }
}
