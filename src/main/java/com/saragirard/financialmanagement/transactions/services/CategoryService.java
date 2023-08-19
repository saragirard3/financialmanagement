package com.saragirard.financialmanagement.transactions.services;

import com.saragirard.financialmanagement.transactions.models.Category;

public interface CategoryService {
    Category findCategoryById(Long categoryId);
}
