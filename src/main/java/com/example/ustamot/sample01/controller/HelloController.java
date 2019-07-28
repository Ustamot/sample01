package com.example.ustamot.sample01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public ModelAndView index(ModelAndView model) {
        model.setViewName("index");
        return model;
    }
}
