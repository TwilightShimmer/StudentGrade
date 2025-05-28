package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zoransunburst.studentGrade.pojo.ExamSchedule;
import top.zoransunburst.studentGrade.service.ExamScheduleService;

import java.util.List;
@RequiredArgsConstructor
@Controller
@RequestMapping("/exam")
public class ExamScheduleController {


    private final ExamScheduleService examScheduleService;

    // 查看考试安排
    @GetMapping("/schedule")
    public String viewExamSchedule(Model model) {
        List<ExamSchedule> schedules = examScheduleService.getAllExamSchedules();
        model.addAttribute("schedules", schedules);
        return "examSchedule";
    }
}