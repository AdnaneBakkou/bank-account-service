package org.sid.bankaccountservice_.web;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bankaccountservice_.dto.BankAccountRequestDTO;
import org.sid.bankaccountservice_.dto.BankAccountResponseDTO;
import org.sid.bankaccountservice_.entities.BankAccount;
import org.sid.bankaccountservice_.repositories.BankAccountRepository;
import org.sid.bankaccountservice_.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphQlController {

    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired

    private AccountService accountService;
    @QueryMapping
    public List<BankAccount> accountsList(){
       return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount bankAccountById(@Argument String id){
        return bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addAccount(bankAccount) ;
    }
}

