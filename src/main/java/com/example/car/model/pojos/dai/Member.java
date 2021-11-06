package com.example.car.model.pojos.dai;


import java.math.BigDecimal;
import java.sql.Timestamp;
/*会员表*/
public class Member {
    private Integer memId;/*编号*/
    private Integer memGrade;/*会员等级*/
    private BigDecimal memBalance;/*会员余额*/
    private Timestamp memTime;/*会员办理时间*/
    private Integer memSum;/*累计消费次数*/
    private BigDecimal memIntegral;/*会员积分*/
 /* private Integer memId;客户外键*/

    @Override
    public String toString() {
        return "Member{" +
                "memId=" + memId +
                ", memGrade=" + memGrade +
                ", memBalance=" + memBalance +
                ", memTime=" + memTime +
                ", memSum=" + memSum +
                ", memIntegral=" + memIntegral +
                '}';
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public Integer getMemGrade() {
        return memGrade;
    }

    public void setMemGrade(Integer memGrade) {
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
