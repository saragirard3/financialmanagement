package com.saragirard.financialmanagement.transaction.repos;

import com.saragirard.financialmanagement.transaction.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
