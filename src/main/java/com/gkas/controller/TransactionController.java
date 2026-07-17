package com.gkas.controller;

import com.gkas.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/health")
    public String healthCheck() {
        return "Transaction Service Running";
    }
}