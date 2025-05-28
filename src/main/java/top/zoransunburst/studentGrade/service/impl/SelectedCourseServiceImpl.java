package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zoransunburst.studentGrade.mapper.SelectedCourseMapper;
import top.zoransunburst.studentGrade.pojo.SelectedCourse;
import top.zoransunburst.studentGrade.service.SelectedCourseService;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SelectedCourseServiceImpl implements SelectedCourseService {

    private final SelectedCourseMapper selectedCourseMapper;

    @Override
    public List<SelectedCourse> getAllSelectedCourses() {
        return selectedCourseMapper.getAllSelectedCourses();
    }
}