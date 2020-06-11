package com.example.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public ResponseEntity getDefault() {
        return new ResponseEntity("test success", HttpStatus.OK);
    }

    @RequestMapping(value = "/user")
    public ResponseEntity getUser() {
        return new ResponseEntity("test success for user", HttpStatus.OK);
    }

    @RequestMapping(value = "/admin")
    public ResponseEntity getAdmin() {
        return new ResponseEntity("test success for admin", HttpStatus.OK);
    }
}
