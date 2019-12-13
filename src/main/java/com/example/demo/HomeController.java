package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
    public class HomeController {
    @Autowired
    BootCampRepository bootCampRepository;

    @RequestMapping("/list")
    public String listJobs(Model model){
        model.addAttribute("bootCamps", bootCampRepository.findAll());
        return "list";
    }

            @RequestMapping("/")
        public String bootlist(){
//            model.addAttribute("bootCamp", bootCampRepository.findAll());
            return "index";
        }
    @RequestMapping("/author")
    public String Author(){
        return "author";
    }

    @RequestMapping("/pushingtogithub")
    public String PushingToGithub(){
        return "pushingtogithub";
    }

    @RequestMapping("/github")
    public String Github(){
        return "github";
    }

    @RequestMapping("/corejava")
    public String CoreJava(){
        return "corejava";
    }

    @RequestMapping("/algorithm")
    public String Algorithm(){
        return "algorithm";
    }

    @RequestMapping("/designingaprogram")
    public String DesigningaProgram(){
        return "designingaprogram";
    }


    @RequestMapping("/javaclass")
    public String ClassesInJava(){
        return "javaclass";
    }

    @RequestMapping("/oop")
    public String WhatIsOop(){
        return "oop";
    }

    @RequestMapping("/html")
    public String HTML(){
        return "html";
    }

    @RequestMapping("/bootstrap")
    public String CSSBootstrap(){
        return "bootstrap";
    }

    @RequestMapping("/inheritanceoop")
    public String InheritanceInOop(){
        return "inheritanceoop";
    }

    @GetMapping("/apply")
        public String bootCamp(Model model){
            model.addAttribute("bootCamp", new BootCamp());
            return "apply";
        }

        @PostMapping("/process")
        public String processForm(@Valid @ModelAttribute BootCamp bootCamp, BindingResult result){
            if (result.hasErrors()){
                return "apply";
            }
            bootCampRepository.save(bootCamp);
            return "redirect:/list";
        }
    @RequestMapping("/detail/{id}")
    public String showBootCamp(@PathVariable("id") long id, Model model){
        model.addAttribute("bootCamp", bootCampRepository.findById(id).get());
        return "show";

                }
        @RequestMapping("/update/{id}")
        public String updateBootCamp(@PathVariable("id") long id, Model model){
            model.addAttribute("bootCamp", bootCampRepository.findById(id).get());
            return "jobform";
        }
        @RequestMapping("/delete/{id}")
        public String delBootCamp(@PathVariable("id") long id){
            bootCampRepository.deleteById(id);
            return "redirect:/";
        }
    }


