package top.zoransunburst.studentGrade.service;

import top.zoransunburst.studentGrade.pojo.Grade;
import top.zoransunburst.studentGrade.pojo.Admin;

import java.util.List;

public interface AdminService {
    // Retrieve
    List<Grade> getStudentGradesByAdminId(Integer adminId);

    // Create
    void addGrade(Grade grade);
    void deleteGrade(Integer gradeId);
    void updateGrade(Grade grade);
    Grade getGradeById(Integer gradeId);
    boolean registerAdmin(Admin admin);
    Admin loginAdmin(String AdminName, String password);
}
