package com.demo.webspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("/res")
    public String sendRes(Model model) {
        model.addAttribute("message", "Hello , Shanti Lal");
        return "index";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String setDemo() {
        return "This is responce";
    }

}
