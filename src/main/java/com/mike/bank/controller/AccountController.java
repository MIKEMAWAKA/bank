package com.mike.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mike.bank.dto.AccountDto;
import com.mike.bank.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/accounts")
public class AccountController {

@Autowired
private AccountService accountService;


///ADDACOUNT

@PostMapping
public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){

    return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
}



}
