package top.zoransunburst.studentGrade.service;

import top.zoransunburst.studentGrade.pojo.Grade;

import java.util.List;
import java.util.Map;

public interface GradeService {
    List<Grade> getGradesByStudentId(Integer studentId);
    Map<String, Object> getGradeStatistics(Integer courseId);
    List<Map<String, Object>> getScoreDistribution(Integer courseId);
    List<Map<String, Object>> getGradeRanking(Integer courseId);
}
