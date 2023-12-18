package com.dac.thym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class myController {

    private List<String> dataList = new ArrayList<>();

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Thymeleaf!");
        model.addAttribute("dataList", dataList);
        return "index";
    }

    @PostMapping("/")
    public String addItem(@RequestParam String newItem) {
        dataList.add(newItem);
        return "redirect:/home";
    }
}
