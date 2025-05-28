package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.zoransunburst.studentGrade.pojo.Course;
import top.zoransunburst.studentGrade.service.CourseService;

@Controller
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    // 查看所有课程
    @GetMapping("/list")
    public String listCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "courseList"; // 对应 /WEB-INF/views/courseList.jsp
    }

    // 跳转添加页面
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("course", new Course());
        return "addCourse";
    }

    // 提交新增课程
    @PostMapping("/add")
    public String addCourse(@ModelAttribute("course") Course course) {
        courseService.addCourse(course);
        return "redirect:/course/list";
    }

    // 删除课程
    @GetMapping("/delete")
    public String deleteCourse(@RequestParam("courseId") Integer courseId) {
        courseService.deleteCourseById(courseId);
        return "redirect:/course/list";
    }

    // 跳转修改页面
    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("courseId") Integer courseId, Model model) {
        Course course = courseService.getCourseById(courseId);
        model.addAttribute("course", course);
        return "updateCourse";
    }

    // 提交修改课程
    @PostMapping("/update")
    public String updateCourse(@ModelAttribute("course") Course course) {
        courseService.updateCourse(course);
        return "redirect:/course/list";
    }
}