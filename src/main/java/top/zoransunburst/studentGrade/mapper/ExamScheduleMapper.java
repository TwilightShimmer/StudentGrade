package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.zoransunburst.studentGrade.pojo.ExamSchedule;

import java.util.List;

@Mapper
public interface ExamScheduleMapper {

    @Select("SELECT * FROM exam_schedule")
    List<ExamSchedule> getAllExamSchedules();
}