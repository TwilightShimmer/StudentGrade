package top.zoransunburst.studentGrade.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.zoransunburst.studentGrade.pojo.Admin;
import top.zoransunburst.studentGrade.service.AdminService;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminControllerLoginAndRegister {
    private final AdminService adminService;
    @GetMapping("/register")
    public String registerPage() {
        return "adminRegister";
    }

    @PostMapping("/register")
    public String register(Admin admin, Model model) {
        if (!adminService.registerAdmin(admin)) {
            model.addAttribute("error", "用户名已存在");
            return "adminRegister";
        }
        return "redirect:/admin/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "adminLogin";
    }

    @PostMapping("/login")
    public String login(@RequestParam String adminName,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {
        Admin admin = adminService.loginAdmin(adminName, password);
        if (admin == null) {
            model.addAttribute("error", "用户名或密码错误");
            return "adminLogin";
        }
        session.setAttribute("admin", admin);
        return "adminDashboard";
    }
}
