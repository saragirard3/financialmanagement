package com.saragirard.financialmanagement.transaction.models;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    public Payee getPayee() {
        return payee;
    }

    public void setPayee(Payee payee) {
        this.payee = payee;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isCleared() {
        return isCleared;
    }

    public void setCleared(boolean cleared) {
        isCleared = cleared;
    }

    public boolean isReconciled() {
        return isReconciled;
    }

    public void setReconciled(boolean reconciled) {
        isReconciled = reconciled;
    }

    public Date getReconciledDate() {
        return reconciledDate;
    }

    public void setReconciledDate(Date reconciledDate) {
        this.reconciledDate = reconciledDate;
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
