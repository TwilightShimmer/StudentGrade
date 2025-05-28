package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.zoransunburst.studentGrade.pojo.Student;

@Mapper
public interface StudentMapper {
    @Insert("INSERT INTO students(student_name, class_id, password) VALUES(#{studentName}, #{classId}, #{password})")
    void registerStudent(Student student);

    @Select("SELECT * FROM students WHERE student_name = #{studentName} AND password = #{password}")
    Student loginStudent(@Param("studentName") String studentName, @Param("password") String password);

    @Select("SELECT COUNT(*) FROM students WHERE student_name = #{studentName}")
    int countByStudentName(String studentName);
}