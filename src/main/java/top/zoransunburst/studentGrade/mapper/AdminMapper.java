package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.*;
import top.zoransunburst.studentGrade.pojo.Grade;
import top.zoransunburst.studentGrade.pojo.Admin;

import java.util.List;

@Mapper
public interface AdminMapper {
    @Select("SELECT * FROM grades WHERE course_id = #{adminId}")
    List<Grade> getStudentGradesByAdminId(Integer adminId);
    @Insert("INSERT INTO grades(student_id, course_id, score) " +
            "VALUES (#{studentId}, #{courseId}, #{score})")
    void addGrade(Grade grade);
    @Delete("DELETE FROM grades WHERE grade_id = #{gradeId}")
    void deleteGrade(Integer gradeId);
    @Update("UPDATE grades SET student_id = #{studentId}, course_id = #{courseId}, score = #{score} WHERE grade_id = #{gradeId}")
    void updateGrade(Grade grade);
    @Select("SELECT * FROM grades WHERE grade_id = #{gradeId}")
    Grade getGradeById(Integer gradeId);
    @Insert("INSERT INTO admins(admin_name, password) VALUES(#{adminName}, #{password})")
    void registerAdmin(Admin admin);

    @Select("SELECT * FROM admins WHERE admin_name = #{adminName} AND password = #{password}")
    Admin loginAdmin(@Param("adminName") String adminName, @Param("password") String password);

    @Select("SELECT COUNT(*) FROM admins WHERE admin_name = #{adminName}")
    int countByAdminName(String adminName);
}
