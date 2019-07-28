package com.example.ustamot.sample01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public ModelAndView login(HttpServletRequest req, ModelAndView model) {
        String userid = req.getParameter("userid1");
        String passwd = req.getParameter("passwd1");
        System.out.println("userid: " + userid);
        System.out.println("passwd: " + passwd);
        model.setViewName("top");
        model.addObject("userid1", userid);
        model.addObject("passwd1", passwd);
        return model;
    }
}
