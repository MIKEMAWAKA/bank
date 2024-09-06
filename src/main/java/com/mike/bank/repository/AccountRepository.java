package com.mike.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mike.bank.entity.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{

}
