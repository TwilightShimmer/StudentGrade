package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import top.zoransunburst.studentGrade.mapper.TeacherMapper;
import top.zoransunburst.studentGrade.pojo.Grade;
import top.zoransunburst.studentGrade.service.TeacherService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherMapper teacherMapper;
    @Override
    public List<Grade> getStudentGradesByTeacherId(Integer teacherId) {
        List<Grade> gradeList = teacherMapper.getStudentGradesByTeacherId(teacherId);
        return teacherMapper.getStudentGradesByTeacherId(teacherId);
    }

    @Override
    public void addGrade(Grade grade) {
        teacherMapper.addGrade(grade);
    }
    @Override
    public void deleteGrade(Integer gradeId) {
        teacherMapper.deleteGrade(gradeId);
    }

    @Override
    public void updateGrade(Grade grade) {
        teacherMapper.updateGrade(grade);
    }
    @Override
    public Grade getGradeById(Integer gradeId) {
        return teacherMapper.getGradeById(gradeId);
    }
}
