package com.demo.webspring.controller;

import java.util.Map;

import com.demo.webspring.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String sendIndex() {
        return "index";
    }

    @RequestMapping("/showform")
    public String showForm() {
        return "showform";
    }

    // @RequestMapping(value = "/processform", method = RequestMethod.POST)
    @PostMapping("/processform")
    public String processForm(@RequestParam("studentname") String studetname, Model model) {
        model.addAttribute("sname", studetname);
        return "processform";
    }

    @RequestMapping(value = "/processformstudent", method = RequestMethod.POST)
    public String requestMethodName(@RequestParam Map<String, String> param, Model model) {
        Student student = new Student();
        student.setName(param.get("name"));
        student.setAge(Integer.parseInt(param.get("age")));
        student.setSex(param.get("sex"));
        System.out.println(student.toString());
        model.addAttribute("Student", student);
        return "studentdetail";
    }

}
