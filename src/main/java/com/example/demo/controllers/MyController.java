package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    private static List<String> plusList;
    static {
        plusList = new ArrayList<>();
        plusList.add("+");
        plusList.add("-");
        plusList.add("*");
        plusList.add("/");
    }

    @GetMapping(path = "/")
    private String getEmployeeForm(Model model) {
        model.addAttribute("plusList", plusList);
        return "home";
    }

    @PostMapping(path = "/")
    private String submitEmployee(@ModelAttribute("plusForm") EmployeeForm employeeForm, Model model) {
        model.addAttribute("data", employeeForm.toString());

        return "result";
    }
}
