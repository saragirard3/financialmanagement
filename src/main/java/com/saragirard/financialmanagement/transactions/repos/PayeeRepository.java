package com.saragirard.financialmanagement.transactions.repos;

import com.saragirard.financialmanagement.transactions.models.Payee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayeeRepository extends JpaRepository<Payee, Long> {
}
