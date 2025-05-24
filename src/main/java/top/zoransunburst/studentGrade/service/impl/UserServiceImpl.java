package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import top.zoransunburst.studentGrade.mapper.UserMapper;
import top.zoransunburst.studentGrade.pojo.Student;
import top.zoransunburst.studentGrade.pojo.Teacher;
import top.zoransunburst.studentGrade.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    @Override
    public Integer getStudentId(String studentName) {
        return userMapper.getStudentId(studentName);
    }

    @Override
    public Integer getTeacherId(String teacherName) {
        return userMapper.getTeacherId(teacherName);
    }

    @Override
    public List<Student> getAllStudentsInfo() {
        List<Student> students = userMapper.getAllStudentsInfo();
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }

    @Override
    public List<Teacher> getAllTeachersInfo() {
        return userMapper.getAllTeachersInfo();
    }
}
