package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.zoransunburst.studentGrade.pojo.Admin;
import top.zoransunburst.studentGrade.pojo.Student;
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
        List<Admin> teachersList = userService.getAllTeachersInfo();
        model.addAttribute("list", teachersList);
        return "chooseTeacher";
    }
    @GetMapping("/studentsDashboard")
    public String studentsDashboard() {
        return "studentsDashboard";
    }
    @GetMapping("/teachersDashboard")
    public String teachersDashboard() {
        return "teachersDashboard";
    }
    // 查看所有学生
    // 查看所有学生列表
    @GetMapping("/list")
    public String listStudents(Model model) {
        List<Student> students = userService.getAllStudents();
        model.addAttribute("students", students);
        return "studentList";
    }

    // 跳转添加学生页面
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    // 提交添加学生表单
    @PostMapping("/add")
    public String addStudent(@ModelAttribute("student") Student student) {
        userService.addStudent(student);
        return "redirect:/user/list";
    }

    // 删除学生
    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("studentId") Integer studentId) {
        userService.deleteStudentById(studentId);
        return "redirect:/user/list";
    }

    // 跳转修改页面
    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("studentId") Integer studentId, Model model) {
        Student student = userService.getStudentById(studentId);
        model.addAttribute("student", student);
        return "updateStudent";
    }

    // 提交修改信息
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("student") Student student) {
        userService.updateStudent(student);
        return "redirect:/user/list";
    }
}
