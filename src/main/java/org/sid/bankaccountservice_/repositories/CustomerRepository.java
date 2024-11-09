package org.sid.bankaccountservice_.repositories;

import org.sid.bankaccountservice_.entities.BankAccount;
import org.sid.bankaccountservice_.entities.Customer;
import org.sid.bankaccountservice_.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {



}
