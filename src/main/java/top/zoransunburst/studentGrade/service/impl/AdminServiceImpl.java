package top.zoransunburst.studentGrade.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zoransunburst.studentGrade.mapper.AdminMapper;
import top.zoransunburst.studentGrade.pojo.Admin;
import top.zoransunburst.studentGrade.pojo.Grade;
import top.zoransunburst.studentGrade.service.AdminService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminMapper adminMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Grade> getStudentGradesByAdminId(Integer AdminId) {
        return adminMapper.getStudentGradesByAdminId(AdminId);
    }

    @Override
    public void addGrade(Grade grade) {
        adminMapper.addGrade(grade);
    }

    @Override
    public void deleteGrade(Integer gradeId) {
        adminMapper.deleteGrade(gradeId);
    }

    @Override
    public void updateGrade(Grade grade) {
        adminMapper.updateGrade(grade);
    }

    @Override
    @Transactional(readOnly = true)
    public Grade getGradeById(Integer gradeId) {
        return adminMapper.getGradeById(gradeId);
    }

    @Override
    public boolean registerAdmin(Admin admin) {
        if (adminMapper.countByAdminName(admin.getAdminName()) > 0) {
            return false; // 用户名已存在
        }
        adminMapper.registerAdmin(admin);
        return true;
    }

    @Override
    @Transactional(readOnly = true)
    public Admin loginAdmin(String adminName, String password) {
        return adminMapper.loginAdmin(adminName, password);
    }
}