package top.zoransunburst.studentGrade.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectedCourse {
    private Integer id;
    private Integer studentId;
    private String studentName;
    private Integer courseId;
    private String courseName;
    private Integer credit;
    private String teacherName;
}
