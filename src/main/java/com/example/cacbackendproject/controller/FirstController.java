package com.example.cacbackendproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/main")
    public String cacMain(){
        return "main";
    }
    @GetMapping("/hi")
    public String board(Model model){
        model.addAttribute("username","성빈");
        return "sample";
    }
}
