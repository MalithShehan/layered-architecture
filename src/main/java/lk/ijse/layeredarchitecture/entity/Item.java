package com.example.layeredarchitecture.entity;

import java.math.BigDecimal;

public class Item {
    private String code;
    private String description;
    private BigDecimal unitPrice;
    private int qtyOnHand;

    public Item(String code, String description, BigDecimal unitPrice, int qtyOnHand) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }
}
