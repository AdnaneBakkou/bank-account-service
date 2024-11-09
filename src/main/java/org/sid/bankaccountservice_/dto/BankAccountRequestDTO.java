package org.sid.bankaccountservice_.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bankaccountservice_.enums.AccountType;

import java.util.Date;

@Data
@Builder @NoArgsConstructor @AllArgsConstructor
public class BankAccountRequestDTO {
    private String id;
    private Double balance ;
    private String currency;
    private AccountType type;


}
