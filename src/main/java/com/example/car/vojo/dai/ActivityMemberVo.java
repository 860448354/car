package com.example.car.vojo.dai;

import com.example.car.model.pojos.dai.Activitytype;
import com.example.car.model.pojos.dai.Actparticipants;
import com.example.car.model.pojos.kj.User;

import java.sql.Timestamp;
import java.util.List;

public class ActivityMemberVo {
    private Integer actiId;/*编号*/
    private String actiName;/*活动名称*/
    private String actiSite;/*活动地点*/
    private Integer actiPeoplesum;/*参与人数*/
    private Timestamp actiTime;/*活动日期*/
    private String actiState;/*活动状态*/
    private Activitytype typId;/*活动类型外键*/
    private User activityUid;/*员工外键*/
    private List<Actparticipants> actipar;/*活动参与人员*/
    private List fruitesis;

    @Override
    public String toString() {
        return "ActivityMemberVo{" +
                "actiId=" + actiId +
                ", actiName='" + actiName + '\'' +
                ", actiSite='" + actiSite + '\'' +
                ", actiPeoplesum=" + actiPeoplesum +
                ", actiTime=" + actiTime +
                ", actiState='" + actiState + '\'' +
                ", typId=" + typId +
                ", activityUid=" + activityUid +
                ", actipar=" + actipar +
                ", fruitesis=" + fruitesis +
                '}';
    }

    public String getActiState() {
        return actiState;
    }

    public void setActiState(String actiState) {
        this.actiState = actiState;
    }

    public List getFruitesis() {
        return fruitesis;
    }

    public void setFruitesis(List fruitesis) {
        this.fruitesis = fruitesis;
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

    public Activitytype getTypId() {
        return typId;
    }

    public void setTypId(Activitytype typId) {
        this.typId = typId;
    }

    public User getActivityUid() {
        return activityUid;
    }

    public void setActivityUid(User activityUid) {
        this.activityUid = activityUid;
    }

    public List<Actparticipants> getActipar() {
        return actipar;
    }

    public void setActipar(List<Actparticipants> actipar) {
        this.actipar = actipar;
    }
}
