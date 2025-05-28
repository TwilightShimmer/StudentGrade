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
    @Select("SELECT SUM(score) AS totalScore FROM grades WHERE student_id = #{studentId}")
    Double getTotalScoreByStudentId(Integer studentId);

    @Select("SELECT c.course_name, g.score " +
            "FROM grades g " +
            "JOIN courses c ON g.course_id = c.course_id " +
            "WHERE g.student_id = #{studentId}")
    List<Map<String, Object>> getSubjectScoresByStudentId(Integer studentId);

    @Select("SELECT s1.student_id, SUM(s1.score) AS total_score, " +
            "RANK() OVER (ORDER BY SUM(s1.score) DESC) AS `rank` " +
            "FROM grades s1 GROUP BY s1.student_id")
    List<Map<String, Object>> getAllStudentTotalScoresWithRank();

    @Select("SELECT c.course_name, g.score FROM grades g JOIN courses c ON g.course_id = c.course_id WHERE g.student_id = #{studentId}")
    List<Map<String, Object>> getSubjectScoresForPieChart(Integer studentId);
}
