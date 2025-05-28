package top.zoransunburst.studentGrade.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.sql.Time;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamSchedule {
    private Integer examId;
    private String subject;
    private Date examDate;
    private Time startTime;
    private Time endTime;
    private String location;
    private String description;
}