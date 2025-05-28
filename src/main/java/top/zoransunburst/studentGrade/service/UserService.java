package top.zoransunburst.studentGrade.service;

import top.zoransunburst.studentGrade.pojo.Admin;
import top.zoransunburst.studentGrade.pojo.Student;

import java.util.List;

public interface UserService {
    Integer getStudentId(String studentName);

    Integer getTeacherId(String teacherName);

    List<Student> getAllStudentsInfo();

    List<Admin> getAllTeachersInfo();

    boolean studentLogin(String username, String password);
    boolean studentRegister(Student student);
    List<Student> getAllStudents();
    void addStudent(Student student);
    void deleteStudentById(Integer studentId);
    Student getStudentById(Integer studentId);
    void updateStudent(Student student);
}
