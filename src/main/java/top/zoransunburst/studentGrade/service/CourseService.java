package top.zoransunburst.studentGrade.service;

import top.zoransunburst.studentGrade.pojo.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    void addCourse(Course course);
    void deleteCourseById(Integer courseId);
    Course getCourseById(Integer courseId);
    void updateCourse(Course course);
}