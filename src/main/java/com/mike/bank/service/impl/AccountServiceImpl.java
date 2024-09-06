package com.mike.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mike.bank.dto.AccountDto;
import com.mike.bank.entity.Account;
import com.mike.bank.mapper.AccountMapper;
import com.mike.bank.repository.AccountRepository;
import com.mike.bank.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {

        Account account = AccountMapper.mapToAccount(accountDto);

      Account saved= accountRepository.save(account);

      return AccountMapper.mapToAccountDto(saved);

    }



}
