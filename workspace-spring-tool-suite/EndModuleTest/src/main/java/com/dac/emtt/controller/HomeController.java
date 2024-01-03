package com.dac.emtt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.dac.emtt.modal.Admin;
import com.dac.emtt.modal.User;
import com.dac.emtt.service.AdminService;
import com.dac.emtt.service.UserService;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @GetMapping("/user/{userId}")
    public String viewUser(Model model, @PathVariable int userId) {
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "user-details"; // Assuming you have a user-details.html template
    }

    @GetMapping("/user/edit/{userId}")
    public String editUser(Model model, @PathVariable int userId) {
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "edit-user"; // Assuming you have an edit-user.html template
    }

    @PostMapping("/user/update/{userId}")
    public String updateUser(@ModelAttribute User user, @PathVariable int userId) {
        userService.updateUser(user, userId);
        return "redirect:/home";
    }

    @GetMapping("/user/delete/{userId}")
    public String deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
        return "redirect:/home";
    }

    // Add similar methods for Admin operations if needed

    @GetMapping("/admin/{adminId}")
    public String viewAdmin(Model model, @PathVariable int adminId) {
        Admin admin = adminService.getAdminById(adminId);
        model.addAttribute("admin", admin);
        return "admin-details"; // Assuming you have an admin-details.html template
    }

    @GetMapping("/admin/edit/{adminId}")
    public String editAdmin(Model model, @PathVariable int adminId) {
        Admin admin = adminService.getAdminById(adminId);
        model.addAttribute("admin", admin);
        return "edit-admin"; // Assuming you have an edit-admin.html template
    }

    @PostMapping("/admin/update/{adminId}")
    public String updateAdmin(@ModelAttribute Admin admin, @PathVariable int adminId) {
        adminService.updateAdmin(admin, adminId);
        return "redirect:/home";
    }

    @GetMapping("/admin/delete/{adminId}")
    public String deleteAdmin(@PathVariable int adminId) {
        adminService.deleteAdmin(adminId);
        return "redirect:/home";
    }
}
