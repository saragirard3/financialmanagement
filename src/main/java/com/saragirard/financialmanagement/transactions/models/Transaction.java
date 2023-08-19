package com.saragirard.financialmanagement.transactions.models;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "transaction")
@Getter
@Setter
public class Transaction {
    Long id;
    Date date;
    int checkNumber;
    Payee payee;
    String memo;
    Category category;
    Category parentCategory;
    float amount;
    boolean isCleared;
    boolean isReconciled;
    Date reconciledDate;

    public Transaction() {
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", checkNumber=" + checkNumber +
                ", payee=" + payee +
                ", memo='" + memo + '\'' +
                ", category=" + category +
                ", parentCategory=" + parentCategory +
                ", amount=" + amount +
                ", isCleared=" + isCleared +
                ", isReconciled=" + isReconciled +
                ", reconciledDate=" + reconciledDate +
                '}';
    }
}
