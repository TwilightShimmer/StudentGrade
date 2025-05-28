package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.*;
import top.zoransunburst.studentGrade.pojo.Student;
import top.zoransunburst.studentGrade.pojo.Admin;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM student_grade_management.students")
    List<Student> getAllStudentsInfo();
    @Select("SELECT * FROM student_grade_management.admins")
    List<Admin> getAllTeachersInfo();
    @Select("SELECT student_id " +
            "FROM student_grade_management.students " +
            "WHERE student_name=#{studentName}")
    Integer getStudentId(String studentName);
    @Select("SELECT student_id " +
            "FROM student_grade_management.students " +
            "WHERE student_name=#{studentName}")
    Integer getTeacherId(String studentName);
    @Select("SELECT * FROM students WHERE student_name = #{username}")
    Student selectStudentByUsername(String username);
    @Insert("INSERT INTO students (student_name, password) VALUES (#{username}, #{password})")
    int insertStudent(Student student);
    @Select("SELECT * FROM students")
    List<Student> getAllStudents();

    @Insert("INSERT INTO students(student_name, class_id, password) VALUES(#{studentName}, #{classId}, #{password})")
    void addStudent(Student student);

    @Delete("DELETE FROM students WHERE student_id = #{studentId}")
    void deleteStudentById(Integer studentId);

    @Select("SELECT * FROM students WHERE student_id = #{studentId}")
    Student getStudentById(Integer studentId);

    @Update("UPDATE students SET student_name=#{studentName}, class_id=#{classId}, password=#{password} WHERE student_id=#{studentId}")
    void updateStudent(Student student);
}
