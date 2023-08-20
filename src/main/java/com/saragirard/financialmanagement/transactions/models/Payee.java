package com.saragirard.financialmanagement.transactions.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Table(name = "payee")
public class Payee {
    @Id Long id;
    @Column String payeeName;
    @Column String payeeDescription;

    public Payee() {
    }

    @Override
    public String toString() {
        return "Payee{" +
                "id=" + id +
                ", payeeName='" + payeeName + '\'' +
                ", payeeDescription='" + payeeDescription + '\'' +
                '}';
    }

}
