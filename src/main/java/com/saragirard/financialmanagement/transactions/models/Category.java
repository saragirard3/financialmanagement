package com.saragirard.financialmanagement.transactions.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "category")
public class Category {
    @Id Long id;
    @Column String category;
    @Column String parentCategory;
    @Column boolean isChild;

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", parentCategory='" + parentCategory + '\'' +
                ", isChild=" + isChild +
                '}';
    }
}
