package com.example.car.model.pojos.dai;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.kj.User;

import java.math.BigDecimal;

public class Customerrecharge {
    private Integer chargeId;/*编号*/
    private String chargeTime;/*充值时间*/
    private BigDecimal chargeMenoy;/*充值金额*/
    private BigDecimal chargeBalance;/*剩余余额*/
    private Customer chargeKhid;/*客户外键*/
    private User chargeUserid;/*员工外键*/

    public Customerrecharge() {
    }

    public Customerrecharge(Integer chargeId, String chargeTime, BigDecimal chargeMenoy, BigDecimal chargeBalance, Customer chargeKhid, User chargeUserid) {
        this.chargeId = chargeId;
        this.chargeTime = chargeTime;
        this.chargeMenoy = chargeMenoy;
        this.chargeBalance = chargeBalance;
        this.chargeKhid = chargeKhid;
        this.chargeUserid = chargeUserid;
    }

    @Override
    public String toString() {
        return "Customerrecharge{" +
                "chargeId=" + chargeId +
                ", chargeTime='" + chargeTime + '\'' +
                ", chargeMenoy=" + chargeMenoy +
                ", chargeBalance=" + chargeBalance +
                ", chargeKhid=" + chargeKhid +
                ", chargeUserid=" + chargeUserid +
                '}';
    }

    public User getChargeUserid() {
        return chargeUserid;
    }

    public void setChargeUserid(User chargeUserid) {
        this.chargeUserid = chargeUserid;
    }

    public Customer getChargeKhid() {
        return chargeKhid;
    }

    public void setChargeKhid(Customer chargeKhid) {
        this.chargeKhid = chargeKhid;
    }

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }

    public BigDecimal getChargeMenoy() {
        return chargeMenoy;
    }

    public void setChargeMenoy(BigDecimal chargeMenoy) {
        this.chargeMenoy = chargeMenoy;
    }

    public BigDecimal getChargeBalance() {
        return chargeBalance;
    }

    public void setChargeBalance(BigDecimal chargeBalance) {
        this.chargeBalance = chargeBalance;
    }
}
