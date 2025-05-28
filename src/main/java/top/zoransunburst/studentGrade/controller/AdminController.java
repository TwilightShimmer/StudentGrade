package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.zoransunburst.studentGrade.pojo.Admin;
import top.zoransunburst.studentGrade.pojo.Grade;
import top.zoransunburst.studentGrade.service.AdminService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/manageStudents/{teacherId}")
    public String manageStudents(@PathVariable Integer teacherId, Model model) {
        // 获取该教师的所有学生成绩
        List<Grade> studentGrades = adminService.getStudentGradesByAdminId(teacherId);
        model.addAttribute("grades", studentGrades);
        model.addAttribute("teacherId", teacherId);
        return "manageStudents";
    }
    @GetMapping("/addGrade/{teacherId}")
    public String addGrade(@PathVariable Integer teacherId, Model model) {
        model.addAttribute("teacherId", teacherId);
        return "addGrade";
    }
    @PostMapping("/saveGrade")
    public String saveGrade(@ModelAttribute Grade grade) {
        adminService.addGrade(grade);
        return "redirect:/teacher/manageStudents/" + grade.getCourseId();
    }
    @PostMapping("/deleteGrade/{gradeId}")
    public String deleteGrade(@PathVariable Integer gradeId, @RequestParam Integer teacherId) {
        adminService.deleteGrade(gradeId);
        return "redirect:/teacher/manageStudents/" + teacherId;
    }
    @GetMapping("/editGrade/{gradeId}")
    public String editGrade(@PathVariable Integer gradeId, Model model) {
        // 这里需要添加获取单个成绩的方法
        Grade grade = adminService.getGradeById(gradeId);
        model.addAttribute("grade", grade);
        return "editGrade";
    }
    @PostMapping("/updateGrade")
    public String updateGrade(@ModelAttribute Grade grade) {
        adminService.updateGrade(grade);
        return "redirect:/teacher/manageStudents/" + grade.getCourseId();
    }
}
