package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zoransunburst.studentGrade.pojo.Student;
import top.zoransunburst.studentGrade.pojo.Teacher;
import top.zoransunburst.studentGrade.service.UserService;

import java.util.List;
@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/chooseUser")
    public String index(){
        return "chooseUser";
    }
    @GetMapping("/getAllStudentsInfo")
    public String getAllStudentsInfo(Model model) {
        List<Student> studentList = userService.getAllStudentsInfo();
        model.addAttribute("list", studentList);
        return "chooseStudent";
    }

    @GetMapping("/getAllTeachersInfo")
    public String getAllTeachersInfo(Model model) {
        List<Teacher> teachersList = userService.getAllTeachersInfo();
        model.addAttribute("list", teachersList);
        return "chooseTeacher";
    }
}
