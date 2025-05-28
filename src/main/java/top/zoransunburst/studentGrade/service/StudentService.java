package top.zoransunburst.studentGrade.service;

import top.zoransunburst.studentGrade.pojo.Student;

public interface StudentService {
    boolean registerStudent(Student student);
    Student loginStudent(String studentName, String password);
}
