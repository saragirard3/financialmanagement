package com.saragirard.financialmanagement.transaction.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "category")
@Getter
@Setter
public class Category {
    @Id Long id;
    @Column String category;
    @Column String parentCategory;
    @Column boolean isChild;

    public Category() {
    }

}
