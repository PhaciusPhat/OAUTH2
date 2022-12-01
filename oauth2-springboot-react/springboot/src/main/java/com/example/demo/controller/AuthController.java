package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Arrays;
import java.util.Map;

@RestController
public class AuthController {
    @GetMapping
    public String home() {
        return "Home";
    }


    @GetMapping("/user")
    public String getUser(Principal principal) {
        System.out.println(principal);
        return "User Information: " + principal.getName();
    }

    @GetMapping("/error")
    public String error() {
        return "Lỗi rồi đấy con tró";
    }


}
