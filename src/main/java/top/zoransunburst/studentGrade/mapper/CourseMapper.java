package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.*;
import top.zoransunburst.studentGrade.pojo.Course;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Select("SELECT * FROM courses")
    List<Course> getAllCourses();

    @Insert("INSERT INTO courses(course_name, credit, teacher_name, description) VALUES(#{courseName}, #{credit}, #{teacherName}, #{description})")
    void addCourse(Course course);

    @Update("UPDATE courses SET course_name=#{courseName}, credit=#{credit}, teacher_name=#{teacherName}, description=#{description} WHERE course_id=#{courseId}")
    void updateCourse(Course course);

    @Delete("DELETE FROM courses WHERE course_id = #{courseId}")
    void deleteCourseById(Integer courseId);

    @Select("SELECT * FROM courses WHERE course_id = #{courseId}")
    Course getCourseById(Integer courseId);
}