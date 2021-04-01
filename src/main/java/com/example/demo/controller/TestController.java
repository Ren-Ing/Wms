package com.example.demo.controller;


import com.example.demo.dao.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController("")
public class TestController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public ModelAndView findById(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }
}
