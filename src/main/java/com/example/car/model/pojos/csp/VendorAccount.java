package com.example.car.model.pojos.csp;

import com.example.car.model.pojos.hyj.Purchase;
import com.example.car.model.pojos.kj.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class VendorAccount {
    private int vendorId;
    private String purOrder;
    private String supplierName;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date vendorDate;
    private double vendorDue;
    private double vendorReceived;
    private double vendorCoupon;
    private String vendorEnter;
    private String vendorType;
    private int sfId;
    private Purchase purchase;
    private Staff staff;
    private String sfName;
    private Date start;
    private Date end;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getPurOrder() {
        return purOrder;
    }

    public void setPurOrder(String purOrder) {
        this.purOrder = purOrder;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public int getSfId() {
        return sfId;
    }

    public void setSfId(int sfId) {
        this.sfId = sfId;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getSfName() {
        return sfName;
    }

    public void setSfName(String sfName) {
        this.sfName = sfName;
    }

    @Override
    public String toString() {
        return "VendorAccount{" +
                "vendorId=" + vendorId +
                ", purOrder='" + purOrder + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", vendorDate=" + vendorDate +
                ", vendorDue=" + vendorDue +
                ", vendorReceived=" + vendorReceived +
                ", vendorCoupon=" + vendorCoupon +
                ", vendorEnter='" + vendorEnter + '\'' +
                ", vendorType='" + vendorType + '\'' +
                ", sfId=" + sfId +
                ", purchase=" + purchase +
                ", staff=" + staff +
                '}';
    }
}
