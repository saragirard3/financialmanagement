package com.saragirard.financialmanagement.transaction.repos;

import com.saragirard.financialmanagement.transaction.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
