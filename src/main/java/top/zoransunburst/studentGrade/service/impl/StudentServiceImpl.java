package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zoransunburst.studentGrade.mapper.StudentMapper;
import top.zoransunburst.studentGrade.pojo.Student;
import top.zoransunburst.studentGrade.service.StudentService;

@Service
@Transactional
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    @Override
    public boolean registerStudent(Student student) {
        if (studentMapper.countByStudentName(student.getStudentName()) > 0) {
            return false; // 用户名已存在
        }
        studentMapper.registerStudent(student);
        return true;
    }

    @Override
    @Transactional(readOnly = true)
    public Student loginStudent(String studentName, String password) {
        return studentMapper.loginStudent(studentName, password);
    }
}