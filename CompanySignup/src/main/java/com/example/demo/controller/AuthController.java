package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class AuthController {
	
	  @Autowired
	    private UserService userService;

	    @GetMapping("/login")
	    public String login() {
	        return "login";
	    }

	    @GetMapping("/signup")
	    public String signup() {
	        return "signup";
	    }

	    @PostMapping("/signup")
	    public String registerUser(@ModelAttribute User user) {
	        userService.saveUser(user);
	        return "redirect:/login";
	    }

}
