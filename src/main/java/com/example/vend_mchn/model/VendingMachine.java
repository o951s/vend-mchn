package com.example.vend_mchn.model;


import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "vendingMachine")
public class VendingMachine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private long id;
    private String productName;
    private int spiralNumber;
    private int salesCount;
    private LocalDateTime time;
    private String machineName;
    private String paymentMethod;
    private boolean discount;
    @NotNull
    private double salesPrice;
    private String result;
    private int count;

    public VendingMachine() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSpiralNumber() {
        return spiralNumber;
    }

    public void setSpiralNumber(int spiralNumber) {
        this.spiralNumber = spiralNumber;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesprice) {
        this.salesPrice = salesprice;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", spiralNumber=" + spiralNumber +
                ", salesCount=" + salesCount +
                ", time=" + time +
                ", machineName='" + machineName + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", discount=" + discount +
                ", salesPrice=" + salesPrice +
                ", result='" + result + '\'' +
                ", count=" + count +
                '}';
    }
}
