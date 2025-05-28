package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zoransunburst.studentGrade.mapper.ExamScheduleMapper;
import top.zoransunburst.studentGrade.pojo.ExamSchedule;
import top.zoransunburst.studentGrade.service.ExamScheduleService;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ExamScheduleServiceImpl implements ExamScheduleService {


    private final ExamScheduleMapper examScheduleMapper;

    @Override
    public List<ExamSchedule> getAllExamSchedules() {
        return examScheduleMapper.getAllExamSchedules();
    }
}