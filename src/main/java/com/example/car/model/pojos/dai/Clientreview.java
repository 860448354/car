package com.example.car.model.pojos.dai;

import java.sql.Timestamp;

/*客户回访记录表（ClientReview）*/
public class Clientreview {
    private Integer revId;/*编号*/
    private Timestamp revTime;/*回访时间*/
    private String revResult;/*回访结果*/
    private Customercare revCare;/*关怀外键*/

    @Override
    public String toString() {
        return "Clientreview{" +
                "revId=" + revId +
                ", revTime=" + revTime +
                ", revResult='" + revResult + '\'' +
                '}';
    }

    public Customercare getRevCare() {
        return revCare;
    }

    public void setRevCare(Customercare revCare) {
        this.revCare = revCare;
    }

    public Integer getRevId() {
        return revId;
    }

    public void setRevId(Integer revId) {
        this.revId = revId;
    }

    public Timestamp getRevTime() {
        return revTime;
    }

    public void setRevTime(Timestamp revTime) {
        this.revTime = revTime;
    }

    public String getRevResult() {
        return revResult;
    }

    public void setRevResult(String revResult) {
        this.revResult = revResult;
    }
}
