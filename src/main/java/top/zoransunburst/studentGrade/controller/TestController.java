package top.zoransunburst.studentGrade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.zoransunburst.studentGrade.pojo.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/students")
public class TestController {

    @GetMapping("/list")
    public ModelAndView getStudentList() {
        // 模拟数据
        List<Student> students = new ArrayList<>();
        students.add(new Student(1001, "张三", 1));
        students.add(new Student(1002, "李四", 2));
        students.add(new Student(1003, "王五", 3));

        // 创建ModelAndView对象
        ModelAndView mav = new ModelAndView();

        // 添加模型数据
        mav.addObject("list", students);

        // 设置视图名称
        mav.setViewName("testJsp");

        return mav;
    }
}