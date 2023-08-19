package com.saragirard.financialmanagement.transaction.repos;

import com.saragirard.financialmanagement.transaction.models.Payee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayeeRepository extends JpaRepository<Payee, Long> {
}
