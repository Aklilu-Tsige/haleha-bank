package com.halehabank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account")
    public String getAccounts(String input){
        return "Here are the accounts details from the DB";
    }
}
