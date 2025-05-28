package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.zoransunburst.studentGrade.pojo.Question;
import top.zoransunburst.studentGrade.service.QuestionService;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    // 查看所有试题
    @GetMapping("/list")
    public String listQuestions(Model model) {
        model.addAttribute("questions", questionService.getAllQuestions());
        return "questionList";
    }

    // 跳转添加页面
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("question", new Question());
        return "addQuestion";
    }

    // 提交新增试题
    @PostMapping("/add")
    public String addQuestion(@ModelAttribute("question") Question question) {
        questionService.addQuestion(question);
        return "redirect:/question/list";
    }

    // 删除试题
    @GetMapping("/delete")
    public String deleteQuestion(@RequestParam("questionId") Integer questionId) {
        questionService.deleteQuestionById(questionId);
        return "redirect:/question/list";
    }

    // 跳转修改页面
    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("questionId") Integer questionId, Model model) {
        model.addAttribute("question", questionService.getQuestionById(questionId));
        return "updateQuestion";
    }

    // 提交更新
    @PostMapping("/update")
    public String updateQuestion(@ModelAttribute("question") Question question) {
        questionService.updateQuestion(question);
        return "redirect:/question/list";
    }
}