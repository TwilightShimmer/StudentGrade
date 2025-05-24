package top.zoransunburst.studentGrade.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    private Integer gradeId;
    private Integer studentId;
    private Integer courseId;
    private Double score;
}