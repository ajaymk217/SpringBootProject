package org.ass.customerdatamanagement.repository;

import org.ass.customerdatamanagement.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankAccount, Integer> {

}
