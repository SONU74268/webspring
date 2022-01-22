package com.demo.webspring.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import com.demo.webspring.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/student-registration")
    public String showForm(Student student, Model model, BindingResult bindingResult) {
        List<String> list = Arrays.asList("Male", "Female", "other");
        model.addAttribute("sex", list);
        List<String> professions = Arrays.asList("Computer", "Civil", "Electrical");
        model.addAttribute("professions", professions);
        return "student-form";
    }

    @PostMapping("/student-registration")
    public String studentReg(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        System.out.println(student);
        return "student-succ";
    }

}
