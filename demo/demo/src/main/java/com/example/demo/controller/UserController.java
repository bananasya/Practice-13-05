package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.description.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUser(id);
    }

    @GetMapping("/query")
    public User getUserByQueryParam(@RequestParam int id) {
        return userService.getUser(id);
    }
}
