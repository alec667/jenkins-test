package com.practica.demojenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyController {

    @GetMapping(path = "/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("Hello :)", HttpStatus.OK);
    }
    
}
