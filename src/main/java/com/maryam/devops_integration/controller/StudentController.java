package com.maryam.devops_integration.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/hello")
    public String welcome(HttpServletRequest request){
        return "<h1>Bienvenue tout le monde. Session ID </h1>" + request.getSession().getId();
    }
}
