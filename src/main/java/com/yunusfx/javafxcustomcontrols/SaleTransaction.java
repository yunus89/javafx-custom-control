package com.yunusfx.javafxcustomcontrols;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatProperty;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.SimpleFloatProperty;

public class SaleTransaction {
    private int id;
    private int productId;
    private int saleTransactionId;
    private int saleType;
    
    private String productName;
    private String date;
    private String createdAt;
    private String transNo;
    private String transType;
    float amnt;
    private final FloatProperty quantity  = new SimpleFloatProperty();
    private final FloatProperty price  = new SimpleFloatProperty();
    private final ReadOnlyFloatWrapper amount  = new ReadOnlyFloatWrapper();

    public SaleTransaction() {
        this(0f, 0f);
    }
    
    public SaleTransaction(float quantity, float price) {
        setQuantity(quantity);
        setPrice(price);
        this.amount.bind(this.quantity.multiply(this.price));
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
    

    public float getAmnt() {
        return amnt;
    }

    public void setAmnt(float amnt) {
        this.amnt = amnt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaleType() {
        return saleType;
    }

    public void setSaleType(int saleType) {
        this.saleType = saleType;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String trnasNo) {
        this.transNo = trnasNo;
    }
    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSaleTransactionId() {
        return saleTransactionId;
    }

    public void setSaleTransactionId(int saleTransactionId) {
        this.saleTransactionId = saleTransactionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public float getQuantity() {
        return quantityProperty().get();
    }

    public void setQuantity(float quantity) {
        quantityProperty().set(quantity);
    }

    public FloatProperty quantityProperty() {
        return quantity ;
    }

    public float getPrice() {
        return priceProperty().get();
    }

    public void setPrice(float price) {
        priceProperty().set(price);
    }

    public FloatProperty priceProperty() {
        return price ;
    }
    

    public float getAmount() {
        return amountProperty().get();
    }

    public ReadOnlyFloatProperty amountProperty() {
        return amount.getReadOnlyProperty();
    }
}
