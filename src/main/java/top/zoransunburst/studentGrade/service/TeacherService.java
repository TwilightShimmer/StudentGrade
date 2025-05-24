package top.zoransunburst.studentGrade.service;

import top.zoransunburst.studentGrade.pojo.Grade;

import java.util.List;

public interface TeacherService {
    // Retrieve
    List<Grade> getStudentGradesByTeacherId(Integer teacherId);

    // Create
    void addGrade(Grade grade);
    void deleteGrade(Integer gradeId);
    void updateGrade(Grade grade);
    Grade getGradeById(Integer gradeId);
}
