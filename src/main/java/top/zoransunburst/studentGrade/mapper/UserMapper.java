package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.zoransunburst.studentGrade.pojo.Student;
import top.zoransunburst.studentGrade.pojo.Teacher;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM student_grade_management.students")
    List<Student> getAllStudentsInfo();
    @Select("SELECT * FROM student_grade_management.teachers")
    List<Teacher> getAllTeachersInfo();
    @Select("SELECT student_id " +
            "FROM student_grade_management.students " +
            "WHERE student_name=#{studentName}")
    Integer getStudentId(String studentName);
    @Select("SELECT student_id " +
            "FROM student_grade_management.students " +
            "WHERE student_name=#{studentName}")
    Integer getTeacherId(String studentName);

}
