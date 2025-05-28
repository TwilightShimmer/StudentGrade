package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zoransunburst.studentGrade.mapper.QuestionMapper;
import top.zoransunburst.studentGrade.pojo.Question;
import top.zoransunburst.studentGrade.service.QuestionService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class QuestionServiceImpl implements QuestionService {

    private final QuestionMapper questionMapper;

    @Override
    public List<Question> getAllQuestions() {
        return questionMapper.getAllQuestions();
    }

    @Override
    public void addQuestion(Question question) {
        questionMapper.addQuestion(question);
    }

    @Override
    public void deleteQuestionById(Integer questionId) {
        questionMapper.deleteQuestionById(questionId);
    }

    @Override
    public Question getQuestionById(Integer questionId) {
        return questionMapper.getQuestionById(questionId);
    }

    @Override
    public void updateQuestion(Question question) {
        questionMapper.updateQuestion(question);
    }
}