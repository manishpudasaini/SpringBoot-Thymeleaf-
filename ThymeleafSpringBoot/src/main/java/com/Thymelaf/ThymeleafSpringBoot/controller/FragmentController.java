package com.Thymelaf.ThymeleafSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentController {
    @GetMapping("/header")
    public String header(Model model){
        return "fragmentCall";
    }
}
