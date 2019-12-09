package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
    public class HomeController {

        @RequestMapping("/")
        public String homePage(){
            return "index";
        }
        @RequestMapping("/author")
        public String authorPage(){
            return "author";
        }
        @RequestMapping("/java bootcamp")
        public String javaBootcamp(){
            return "java bootcamp";
        }
    @RequestMapping("/apply")
    public String applyPage(){
        return "apply";
    }
    }
