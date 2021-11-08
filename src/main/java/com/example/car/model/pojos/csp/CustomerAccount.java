package com.example.car.model.pojos.csp;

import com.example.car.model.pojos.czh.Customer;

public class CustomerAccount {
    private int accountId;
    private double accountDue;
    private double accountReceived;
    private double accountCoupon;
    private String accountEnter;
    private String accountType;
    private Customer customer;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
