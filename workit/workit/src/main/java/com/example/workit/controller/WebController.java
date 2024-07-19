package com.example.workit.controller;

import com.example.workit.model.User;
import com.example.workit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class WebController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/cadastro")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new User());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String registerUser(@ModelAttribute("user") User user) {
        System.out.println("User: " + user);

        userService.saveUser(user);
        return "redirect:/login";
    }
}
