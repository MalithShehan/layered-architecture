package com.example.layeredarchitecture.entity;

import java.math.BigDecimal;

public class OrderDetails {
    private String oid;
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    public void setOid(String oid) {
        this.oid = oid;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getOid() {
        return oid;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getQty() {
        return qty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public OrderDetails(String oid, String itemCode, int qty, BigDecimal unitPrice) {
        this.oid = oid;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
}
