package com.example.car.model.pojos.csp;

import com.example.car.model.pojos.czh.ConfirmCompleted;
import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.kj.Staff;

import java.util.Date;

public class CustomerAccount {
    private int accountId;
    private int crId;
    private int ccId;
    private double accountDue;
    private double accountReceived;
    private double accountCoupon;
    private String accountEnter;
    private String accountType;
    private int sfId;
    private Date accountDate;
    private Customer customer;
    private String crName;
    private String carNumber;
    private Date start;
    private Date end;
    private ConfirmCompleted confirmCompleted;
    private Staff staff;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public ConfirmCompleted getConfirmCompleted() {
        return confirmCompleted;
    }

    public void setConfirmCompleted(ConfirmCompleted confirmCompleted) {
        this.confirmCompleted = confirmCompleted;
    }

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

    public String getCrName() {
        return crName;
    }

    public void setCrName(String crName) {
        this.crName = crName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCrId() {
        return crId;
    }

    public void setCrId(int crId) {
        this.crId = crId;
    }

    public int getCcId() {
        return ccId;
    }

    public void setCcId(int ccId) {
        this.ccId = ccId;
    }

    public double getAccountDue() {
        return accountDue;
    }

    public void setAccountDue(double accountDue) {
        this.accountDue = accountDue;
    }

    public double getAccountReceived() {
        return accountReceived;
    }

    public void setAccountReceived(double accountReceived) {
        this.accountReceived = accountReceived;
    }

    public double getAccountCoupon() {
        return accountCoupon;
    }

    public void setAccountCoupon(double accountCoupon) {
        this.accountCoupon = accountCoupon;
    }

    public String getAccountEnter() {
        return accountEnter;
    }

    public void setAccountEnter(String accountEnter) {
        this.accountEnter = accountEnter;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getSfId() {
        return sfId;
    }

    public void setSfId(int sfId) {
        this.sfId = sfId;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "accountId=" + accountId +
                ", crId=" + crId +
                ", ccId=" + ccId +
                ", accountDue=" + accountDue +
                ", accountReceived=" + accountReceived +
                ", accountCoupon=" + accountCoupon +
                ", accountEnter='" + accountEnter + '\'' +
                ", accountType='" + accountType + '\'' +
                ", sfId=" + sfId +
                ", accountDate=" + accountDate +
                ", customer=" + customer +
                '}';
    }
}
