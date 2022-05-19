package com.halehabank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/loans")
    public String getLoan(String input){
        return "Here are the loans details from the DB";
    }
}
