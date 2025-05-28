package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.zoransunburst.studentGrade.mapper.UserMapper;
import top.zoransunburst.studentGrade.pojo.Admin;
import top.zoransunburst.studentGrade.pojo.Student;
import top.zoransunburst.studentGrade.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@Service
// 默认对整个类开启事务，可被方法覆盖
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.DEFAULT,
        rollbackFor = Exception.class
)
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    // ================== 只读操作使用 readOnly = true ===================

    @Override
    @Transactional(readOnly = true)
    public Integer getStudentId(String studentName) {
        return userMapper.getStudentId(studentName);
    }

    @Override
    @Transactional(readOnly = true)
    public Integer getTeacherId(String teacherName) {
        return userMapper.getTeacherId(teacherName);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudentsInfo() {
        List<Student> students = userMapper.getAllStudentsInfo();
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Admin> getAllTeachersInfo() {
        return userMapper.getAllTeachersInfo();
    }

    @Override
    @Transactional(readOnly = true)
    public boolean studentLogin(String username, String password) {
        Student student = userMapper.selectStudentByUsername(username);
        return student != null && student.getPassword().equals(password);
    }

    // ================== 写操作，默认继承类上的事务配置 ===================

    @Override
    public boolean studentRegister(Student student) {
        Student existingStudent = userMapper.selectStudentByUsername(student.getStudentName());
        if (existingStudent != null) {
            return false; // 用户名已存在
        }
        int result = userMapper.insertStudent(student);
        return result > 0;
    }

    @Override
    public List<Student> getAllStudents() {
        return userMapper.getAllStudents();
    }

    @Override
    public void addStudent(Student student) {
        userMapper.addStudent(student);
    }

    @Override
    public void deleteStudentById(Integer studentId) {
        userMapper.deleteStudentById(studentId);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return userMapper.getStudentById(studentId);
    }

    @Override
    public void updateStudent(Student student) {
        userMapper.updateStudent(student);
    }
}