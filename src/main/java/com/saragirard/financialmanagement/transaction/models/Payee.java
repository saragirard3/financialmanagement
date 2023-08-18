package com.saragirard.financialmanagement.transaction.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "payee")
@Getter
@Setter
public class Payee {
    @Id Long id;
    @Column String payeeName;
    @Column String payeeDescription;

    public Payee() {
    }

}
