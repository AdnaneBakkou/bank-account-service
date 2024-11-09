package org.sid.bankaccountservice_.service;

import org.sid.bankaccountservice_.dto.BankAccountRequestDTO;
import org.sid.bankaccountservice_.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);

}
