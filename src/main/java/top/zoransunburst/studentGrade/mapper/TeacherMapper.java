package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.*;
import top.zoransunburst.studentGrade.pojo.Grade;

import java.util.List;

@Mapper
public interface TeacherMapper {
    @Select("SELECT * FROM grades WHERE course_id = #{teacherId}")
    List<Grade> getStudentGradesByTeacherId(Integer teacherId);
    @Insert("INSERT INTO grades(student_id, course_id, score) " +
            "VALUES (#{studentId}, #{courseId}, #{score})")
    void addGrade(Grade grade);
    @Delete("DELETE FROM grades WHERE grade_id = #{gradeId}")
    void deleteGrade(Integer gradeId);
    @Update("UPDATE grades SET student_id = #{studentId}, course_id = #{courseId}, score = #{score} WHERE grade_id = #{gradeId}")
    void updateGrade(Grade grade);
    @Select("SELECT * FROM grades WHERE grade_id = #{gradeId}")
    Grade getGradeById(Integer gradeId);
}
