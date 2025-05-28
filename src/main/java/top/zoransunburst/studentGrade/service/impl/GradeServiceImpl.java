package top.zoransunburst.studentGrade.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import top.zoransunburst.studentGrade.mapper.GradeMapper;
import top.zoransunburst.studentGrade.pojo.Grade;
import top.zoransunburst.studentGrade.service.GradeService;

import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class GradeServiceImpl implements GradeService {
    private final GradeMapper gradeMapper;
    @Override
    public List<Grade> getGradesByStudentId(Integer studentId) {
        return gradeMapper.getGradesByStudentId(studentId);
    }
    @Override
    public Map<String, Object> getGradeStatistics(Integer courseId) {
        return gradeMapper.getGradeStatistics(courseId);
    }

    @Override
    public List<Map<String, Object>> getScoreDistribution(Integer courseId) {
        return gradeMapper.getScoreDistribution(courseId);
    }
    @Override
    public List<Map<String, Object>> getGradeRanking(Integer courseId) {
        return gradeMapper.getGradeRanking(courseId);
    }
    @Override
    public Double getTotalScoreByStudentId(Integer studentId) {
        return gradeMapper.getTotalScoreByStudentId(studentId);
    }

    @Override
    public List<Map<String, Object>> getSubjectScoresByStudentId(Integer studentId) {
        return gradeMapper.getSubjectScoresByStudentId(studentId);
    }

    @Override
    public List<Map<String, Object>> getSubjectScoresForPieChart(Integer studentId) {
        return gradeMapper.getSubjectScoresByStudentId(studentId);
    }

    @Override
    public List<Map<String, Object>> getAllStudentRanks() {
        return gradeMapper.getAllStudentTotalScoresWithRank();
    }

}