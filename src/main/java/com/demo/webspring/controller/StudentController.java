package com.demo.webspring.controller;

import java.util.Arrays;
import java.util.List;

import com.demo.webspring.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/student-registration")
    public String showForm(Student student, Model model) {
        List<String> list = Arrays.asList("Male", "Female", "other");
        model.addAttribute("sex", list);
        List<String> professions = Arrays.asList("Computer", "Civil", "Electrical");
        model.addAttribute("professions", professions);
        return "student-form";
    }

    @PostMapping("/student-registration")
    public String studentReg(@ModelAttribute("student") Student student) {
        System.out.println(student);
        return "student-succ";
    }

}
