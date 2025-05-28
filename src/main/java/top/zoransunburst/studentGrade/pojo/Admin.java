package top.zoransunburst.studentGrade.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private String adminName;
    private Integer adminId;
    private String password;
}
