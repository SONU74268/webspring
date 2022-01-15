package com.demo.webspring.controller;

import java.util.Map;

import com.demo.webspring.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    // without model
    @RequestMapping("/showform")
    public String showForm() {
        return "showform";
    }

    // with model
    @RequestMapping("/showformmodel")
    public String showFormModel() {
        return "showformmodel";
    }

    // @RequestMapping(value = "/processform", method = RequestMethod.POST)
    @PostMapping("/processform")
    public String processForm(@RequestParam("studentname") String studetname, Model model) {
        model.addAttribute("sname", studetname);
        return "processform";
    }

    // process form for showing student data using request parm post method
    @RequestMapping(value = "/processformstudent", method = RequestMethod.POST)
    public String requestMethodName(@RequestParam Map<String, String> param, Model model) {
        // Student student = new Student();
        // student.setName(param.get("name"));
        // student.setAge(param.get("age"));
        // student.setSex(param.get("sex"));
        // System.out.println(student.toString());
        // model.addAttribute("Student", student);
        return "studentdetail";
    }

    // process form request using model attribute
    @RequestMapping(value = "/processmodel", method = RequestMethod.POST)
    public String studentFormModel(@ModelAttribute("student") Student s) {
        System.out.println(s.toString());
        return "processformmodel";
    }

}
