package com.example.rendering;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class DemoController {

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("hobbies", Arrays.asList("Cinema", "Poker", "Swimming"));
        return "index.html";
    }

    @GetMapping(value = "main.css")
    public String main(Model model) {
        model.addAttribute("backgroundColor", "lightblue");
        return "main.css";
    }

    @GetMapping(value = "common.js")
    public String common(Model model) {
        model.addAttribute("code", "Thymeleaf rules!".hashCode());
        return "common.js";
    }
}
