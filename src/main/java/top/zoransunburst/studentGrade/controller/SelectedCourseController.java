package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zoransunburst.studentGrade.pojo.SelectedCourse;
import top.zoransunburst.studentGrade.service.SelectedCourseService;

@Controller
@RequestMapping("/selectedCourse")
@RequiredArgsConstructor
public class SelectedCourseController {

    private final SelectedCourseService selectedCourseService;

    // 查看所有学生的选课情况
    @GetMapping("/list")
    public String listSelectedCourses(Model model) {
        model.addAttribute("selectedCourses", selectedCourseService.getAllSelectedCourses());
        return "selectedCourseList";
    }
}