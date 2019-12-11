package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
    public class HomeController {
    @Autowired
    BootCampRepository bootCampRepository;

            @RequestMapping("/")
        public String bootlist(Model model){
            model.addAttribute("BootCamps", bootCampRepository.findAll());
            return "index";
        }
    @RequestMapping("/author")
    public String Author(){
        return "author";
    }

    @RequestMapping("/apply")
    public String applylist(){
        return "apply";
    }

        @GetMapping("/add")
        public String bootCamp(Model model){
            model.addAttribute("BootCamp", new BootCamp());
            return "apply";
        }


        @PostMapping("/process")
        public String processForm(@Valid BootCamp bootCamp, BindingResult result){
            if (result.hasErrors()){
                return "apply";
            }
            bootCampRepository.save(bootCamp);
            return "redirect:/";
        }

        }


