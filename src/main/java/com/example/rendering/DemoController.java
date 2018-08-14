package com.example.rendering;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@Controller
public class DemoController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        System.out.println("HTML");
        model.addAttribute("hobbies", Arrays.asList("Cinema", "Poker", "Swimming"));
        return "index.html";
    }

    @RequestMapping(value = "main.css", method = RequestMethod.GET)
    public String main(Model model, HttpServletResponse response) {
        System.out.println("CSS");
        model.addAttribute("backgroundColor", "lightblue");
        return "css/main.css";
    }

    @RequestMapping(value = "common.js", method = RequestMethod.GET)
    public String common(Model model, HttpServletResponse response) {
        System.out.println("JAVASCRIPT");
        model.addAttribute("code", "Thymeleaf rules!".hashCode());
        return "js/common.js";
    }
}
