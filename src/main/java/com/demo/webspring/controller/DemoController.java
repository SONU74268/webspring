package com.demo.webspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
