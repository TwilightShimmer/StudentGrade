package top.zoransunburst.studentGrade.service;

import top.zoransunburst.studentGrade.pojo.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();
    void addQuestion(Question question);
    void deleteQuestionById(Integer questionId);
    Question getQuestionById(Integer questionId);
    void updateQuestion(Question question);
}