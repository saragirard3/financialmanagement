package com.saragirard.financialmanagement.transactions.repos;

import com.saragirard.financialmanagement.transactions.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
