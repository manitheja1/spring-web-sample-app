package com.mani.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "world") String name, Model model) {

        model.addAttribute("user", name);


        return "hello";
    }


}
