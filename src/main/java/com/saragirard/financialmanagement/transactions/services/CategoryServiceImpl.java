package com.saragirard.financialmanagement.transactions.services;

import com.saragirard.financialmanagement.transactions.models.Category;
import com.saragirard.financialmanagement.transactions.repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;


    @Override
    public Category findCategoryById(Long categoryId) {
        return null;
    }
}
