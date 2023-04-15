package com.Thymelaf.ThymeleafSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MyController {

    @GetMapping("/home")
    public String homePage(Model model){
        model.addAttribute("name","Manish pudasaini");
        return "home";
    }

    @GetMapping("/nameList")
    public  String iterator(Model m){
        List<String> names = new ArrayList<>();
        names.add("manish");
        names.add("Ronaldo");
        names.add("messi");
        names.add("Kroos");
        names.add("modric");
        m.addAttribute("nameList",names);
        return "iterator";
    }
}
