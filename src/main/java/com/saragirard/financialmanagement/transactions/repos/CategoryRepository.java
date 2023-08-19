package com.saragirard.financialmanagement.transactions.repos;

import com.saragirard.financialmanagement.transactions.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
