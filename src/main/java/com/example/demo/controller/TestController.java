package com.example.demo.controller;


import com.example.demo.dao.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public User findById(@RequestParam("id")Integer id ){
        return userService.findById(id);
    }
}
