package com.example.car.model.pojos.dai;

import java.sql.Timestamp;
/* 活动表*/
public class Activity {
    private Integer actiId;/*编号*/
    private String actiName;/*活动名称*/
    private String actiSite;/*活动地点*/
    private Integer actiPeoplesum;/*参与人数*/
    private Timestamp actiTime;/*活动日期*/
    private Activitytype typId;/*活动类型外键*/
    /*
    * private Integer actiId;员工外键
    * */

    @Override
    public String toString() {
        return "Activity{" +
                "actiId=" + actiId +
                ", actiName='" + actiName + '\'' +
                ", actiSite='" + actiSite + '\'' +
                ", actiPeoplesum=" + actiPeoplesum +
                ", actiTime=" + actiTime +
                ", typId=" + typId +
                '}';
    }

    public Activitytype getTypId() {
        return typId;
    }

    public void setTypId(Activitytype typId) {
        this.typId = typId;
    }

    public Integer getActiId() {
        return actiId;
    }

    public void setActiId(Integer actiId) {
        this.actiId = actiId;
    }

    public String getActiName() {
        return actiName;
    }

    public void setActiName(String actiName) {
        this.actiName = actiName;
    }

    public String getActiSite() {
        return actiSite;
    }

    public void setActiSite(String actiSite) {
        this.actiSite = actiSite;
    }

    public Integer getActiPeoplesum() {
        return actiPeoplesum;
    }

    public void setActiPeoplesum(Integer actiPeoplesum) {
        this.actiPeoplesum = actiPeoplesum;
    }

    public Timestamp getActiTime() {
        return actiTime;
    }

    public void setActiTime(Timestamp actiTime) {
        this.actiTime = actiTime;
    }
}
