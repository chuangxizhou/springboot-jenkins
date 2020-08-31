package com.example.springbootjenkins.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "HelloWorld SpringBoot-Jenkins";
    }

}
