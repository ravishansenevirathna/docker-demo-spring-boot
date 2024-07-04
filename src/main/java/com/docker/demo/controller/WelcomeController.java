package com.docker.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 7/3/2024
 * Created time : 11:13 PM
 */
@Controller
@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/docker/demo")
    public String uploadCustomersData(){
        return("Simple Spring boot project to demonstrate Docker");
    }

}
