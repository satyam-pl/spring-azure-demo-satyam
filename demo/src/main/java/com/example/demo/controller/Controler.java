package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler
{

    @GetMapping("/message")
    public String message()
    {
        return "You have deployed your first java application on azure web app";

    }
}
