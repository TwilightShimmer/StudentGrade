package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.*;
import top.zoransunburst.studentGrade.pojo.Question;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Select("SELECT * FROM question")
    List<Question> getAllQuestions();

    @Insert({
            "INSERT INTO question(content, option_a, option_b, option_c, option_d, correct_answer, difficulty, subject)",
            "VALUES(#{content}, #{optionA}, #{optionB}, #{optionC}, #{optionD}, #{correctAnswer}, #{difficulty}, #{subject})"
    })
    void addQuestion(Question question);

    @Delete("DELETE FROM question WHERE question_id = #{questionId}")
    void deleteQuestionById(Integer questionId);

    @Select("SELECT * FROM question WHERE question_id = #{questionId}")
    Question getQuestionById(Integer questionId);

    @Update({
            "UPDATE question SET content = #{content}, option_a = #{optionA}, option_b = #{optionB}, option_c = #{optionC}, option_d = #{optionD}, correct_answer = #{correctAnswer}, difficulty = #{difficulty}, subject = #{subject} WHERE question_id = #{questionId}"
    })
    void updateQuestion(Question question);
}