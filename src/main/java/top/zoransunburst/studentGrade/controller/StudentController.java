package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.zoransunburst.studentGrade.pojo.Student;
import top.zoransunburst.studentGrade.service.StudentService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/register")
    public String registerPage() {
        return "studentRegister";
    }

    @PostMapping("/register")
    public String register(Student student, Model model) {
        if (!studentService.registerStudent(student)) {
            model.addAttribute("error", "用户名已存在");
            return "studentRegister";
        }
        return "redirect:/student/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "studentLogin";
    }

    @PostMapping("/login")
    public String login(@RequestParam String studentName,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {
        Student student = studentService.loginStudent(studentName, password);
        if (student == null) {
            model.addAttribute("error", "用户名或密码错误");
            return "studentLogin";
        }
        session.setAttribute("student", student);
        return "studentDashboard";
    }
}