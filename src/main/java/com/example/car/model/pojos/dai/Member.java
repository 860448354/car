package com.example.car.model.pojos.dai;


import com.example.car.model.pojos.czh.Customer;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/*会员表*/
public class Member {
    private Integer memId;/*编号*/
    private String memGrade;/*会员等级*/
    private BigDecimal memBalance;/*会员余额*/
    private Timestamp memTime;/*会员办理时间*/
    private Integer memSum;/*累计消费次数*/
    private BigDecimal memBalancedsum;/*会员总余额*/
    private BigDecimal memIntegral;/*会员积分*/
    private Customer crId;/*客户外键*/
    private List<Actparticipants> pants;/*会员活动人员表*/

    @Override
    public String toString() {
        return "Member{" +
                "memId=" + memId +
                ", memGrade='" + memGrade + '\'' +
                ", memBalance=" + memBalance +
                ", memTime=" + memTime +
                ", memSum=" + memSum +
                ", memBalancedsum=" + memBalancedsum +
                ", memIntegral=" + memIntegral +
                ", crId=" + crId +
                ", pants=" + pants +
                '}';
    }

    public List<Actparticipants> getPants() {
        return pants;
    }

    public void setPants(List<Actparticipants> pants) {
        this.pants = pants;
    }

    public BigDecimal getMemBalancedsum() {
        return memBalancedsum;
    }

    public void setMemBalancedsum(BigDecimal memBalancedsum) {
        this.memBalancedsum = memBalancedsum;
    }

    public Customer getCrId() {
        return crId;
    }

    public void setCrId(Customer crId) {
        this.crId = crId;
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public String getMemGrade() {
        return memGrade;
    }

    public void setMemGrade(String memGrade) {
        this.memGrade = memGrade;
    }

    public BigDecimal getMemBalance() {
        return memBalance;
    }

    public void setMemBalance(BigDecimal memBalance) {
        this.memBalance = memBalance;
    }

    public Timestamp getMemTime() {
        return memTime;
    }

    public void setMemTime(Timestamp memTime) {
        this.memTime = memTime;
    }

    public Integer getMemSum() {
        return memSum;
    }

    public void setMemSum(Integer memSum) {
        this.memSum = memSum;
    }

    public BigDecimal getMemIntegral() {
        return memIntegral;
    }

    public void setMemIntegral(BigDecimal memIntegral) {
        this.memIntegral = memIntegral;
    }

}
