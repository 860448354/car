package com.example.car.model.pojos.csp;

import com.example.car.model.pojos.hyj.Purchase;
import com.example.car.model.pojos.hyj.Supplier;
import com.example.car.model.pojos.kj.Staff;

import java.util.Date;

public class VendorAccount {
    private int vendorId;
    private Date vendorDate;
    private double vendorDue;
    private double vendorReceived;
    private double vendorCoupon;
    private String vendorEnter;
    private String vendorType;
    private Purchase purchase;
    private Supplier supplier;
    private Staff staff;

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public Date getVendorDate() {
        return vendorDate;
    }

    public void setVendorDate(Date vendorDate) {
        this.vendorDate = vendorDate;
    }

    public double getVendorDue() {
        return vendorDue;
    }

    public void setVendorDue(double vendorDue) {
        this.vendorDue = vendorDue;
    }

    public double getVendorReceived() {
        return vendorReceived;
    }

    public void setVendorReceived(double vendorReceived) {
        this.vendorReceived = vendorReceived;
    }

    public double getVendorCoupon() {
        return vendorCoupon;
    }

    public void setVendorCoupon(double vendorCoupon) {
        this.vendorCoupon = vendorCoupon;
    }

    public String getVendorEnter() {
        return vendorEnter;
    }

    public void setVendorEnter(String vendorEnter) {
        this.vendorEnter = vendorEnter;
    }

    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
