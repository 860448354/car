package com.example.car.model.pojos.dai;

import java.sql.Timestamp;

/*客户回访记录表（ClientReview）*/
public class Clientreview {
    private Integer revId;/*编号*/
    private Timestamp revTime;/*回访时间*/
    private String revResult;/*回访结果*/
   /* private Integer revResult;责任员工
    private Integer revResult;客户外键*/

    @Override
    public String toString() {
        return "Clientreview{" +
                "revId=" + revId +
                ", revTime=" + revTime +
                ", revResult='" + revResult + '\'' +
                '}';
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
