package top.zoransunburst.studentGrade.service;

import top.zoransunburst.studentGrade.pojo.Student;
import top.zoransunburst.studentGrade.pojo.Teacher;

import java.util.List;

public interface UserService {
    Integer getStudentId(String studentName);

    Integer getTeacherId(String teacherName);

    List<Student> getAllStudentsInfo();

    List<Teacher> getAllTeachersInfo();
}
