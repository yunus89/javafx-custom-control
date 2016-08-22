package com.yunusfx.javafxcustomcontrols;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    public static int CREDIT_SALE_TYPE = 1;
    public static int CASH_SALE_TYPE = 2;
    
    private int id;
    private int addedBy;
    private int memberId;
    private int saleType;
    private String referenceNumber;
    private float transactionValue;
    private int sent;
    private int deleteStatus;
    private String date;
    private List<SaleTransaction> saleTransactionList = new ArrayList<>();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getSaleType() {
        return saleType;
    }

    public void setSaleType(int saleType) {
        this.saleType = saleType;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public float getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(float transactionValue) {
        this.transactionValue = transactionValue;
    }

    public int getSent() {
        return sent;
    }

    public void setSent(int sent) {
        this.sent = sent;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<SaleTransaction> getSaleTransactionList() {
        return saleTransactionList;
    }

    public void setSaleTransactionList(List<SaleTransaction> saleTransactionList) {
        this.saleTransactionList = saleTransactionList;
    }
    
    
}
