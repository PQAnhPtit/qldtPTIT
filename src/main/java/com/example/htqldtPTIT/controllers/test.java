package com.example.htqldtPTIT.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {

    @GetMapping("/a")
    public String index(){
        return "index";
    }
}
