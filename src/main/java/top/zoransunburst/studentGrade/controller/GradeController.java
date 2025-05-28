package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zoransunburst.studentGrade.pojo.Grade;
import top.zoransunburst.studentGrade.service.GradeService;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/grade")
@RequiredArgsConstructor
public class GradeController {
    private final GradeService gradeService;
    @GetMapping("/chooseGrade/{studentId}")
    public String studentGrade(@PathVariable Integer studentId, Model model){
        List<Grade> grade = gradeService.getGradesByStudentId(studentId);
        model.addAttribute("grade",grade);
        return "chooseGrade";
    }
    @GetMapping("/statistics/{courseId}")
    public String showStatistics(@PathVariable Integer courseId, Model model) {
        model.addAttribute("statistics", gradeService.getGradeStatistics(courseId));
        model.addAttribute("distribution", gradeService.getScoreDistribution(courseId));
        return "statistics";
    }
    @GetMapping("/ranking/{courseId}")
    public String showRanking(@PathVariable Integer courseId, Model model) {
        List<Map<String, Object>> ranking = gradeService.getGradeRanking(courseId);
        model.addAttribute("ranking", ranking);
        model.addAttribute("courseId", courseId);
        return "gradeRanking";
    }
    @GetMapping("/analysis/{studentId}")
    public String analyzeStudentGrades(@PathVariable Integer studentId, Model model) {
        // 获取该学生成绩
        List<Map<String, Object>> subjectScores = gradeService.getSubjectScoresByStudentId(studentId);
        // 获取总成绩
        Double totalScore = gradeService.getTotalScoreByStudentId(studentId);
        // 获取排名
        List<Map<String, Object>> allRanks = gradeService.getAllStudentRanks();

        int rank = 0;
        for (Map<String, Object> item : allRanks) {
            Integer id = (Integer) item.get("student_id");
            if (id.equals(studentId)) {
                // 修复点：将 BigInteger 转换为 Integer
                Object rawRank = item.get("rank");
                rank = (rawRank instanceof Integer)
                        ? (Integer) rawRank
                        : ((BigInteger) rawRank).intValueExact();
                break;
            }
        }

        model.addAttribute("subjectScores", subjectScores);
        model.addAttribute("totalScore", totalScore);
        model.addAttribute("rank", rank);
        model.addAttribute("studentId", studentId);

        return "gradeAnalysis";
    }
}
