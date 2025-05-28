package top.zoransunburst.studentGrade.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.zoransunburst.studentGrade.pojo.SelectedCourse;

import java.util.List;

@Mapper
public interface SelectedCourseMapper {

    @Select("SELECT sc.id, s.student_id, s.student_name, c.course_id, c.course_name, c.credit, c.teacher_name " +
            "FROM selected_course sc " +
            "JOIN students s ON sc.student_id = s.student_id " +
            "JOIN courses c ON sc.course_id = c.course_id")
    List<SelectedCourse> getAllSelectedCourses();
}