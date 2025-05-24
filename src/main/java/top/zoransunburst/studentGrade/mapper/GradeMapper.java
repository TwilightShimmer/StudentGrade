package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.*;
import top.zoransunburst.studentGrade.pojo.Grade;

import java.util.List;
import java.util.Map;


@Mapper
public interface GradeMapper {
    @Select("SELECT * FROM student_grade_management.grades" +
            " WHERE student_id=#{studentId}")
    List<Grade>  getGradesByStudentId(Integer studentId);
    @Select("SELECT AVG(score) as avgScore, MAX(score) as maxScore, MIN(score) as minScore FROM grades WHERE course_id = #{courseId}")
    Map<String, Object> getGradeStatistics(Integer courseId);

    @Select("SELECT score, COUNT(*) as count FROM grades WHERE course_id = #{courseId} GROUP BY score")
    List<Map<String, Object>> getScoreDistribution(Integer courseId);
    @Select("SELECT student_id,score," +
            "RANK() OVER (ORDER BY score DESC) AS `rank` " +
            "FROM grades " +
            "WHERE course_id = #{courseId}")
    List<Map<String, Object>> getGradeRanking(Integer courseId);

}
