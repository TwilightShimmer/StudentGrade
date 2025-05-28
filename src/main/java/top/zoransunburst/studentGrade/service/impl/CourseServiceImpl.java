package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.zoransunburst.studentGrade.mapper.CourseMapper;
import top.zoransunburst.studentGrade.pojo.Course;
import top.zoransunburst.studentGrade.service.CourseService;

import java.util.List;

@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.DEFAULT,
        readOnly = false,
        rollbackFor = Exception.class
)
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {


    private final CourseMapper courseMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Course> getAllCourses() {
        return courseMapper.getAllCourses();
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.addCourse(course);
    }

    @Override
    public void deleteCourseById(Integer courseId) {
        courseMapper.deleteCourseById(courseId);
    }

    @Override
    @Transactional(readOnly = true)
    public Course getCourseById(Integer courseId) {
        return courseMapper.getCourseById(courseId);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }
}