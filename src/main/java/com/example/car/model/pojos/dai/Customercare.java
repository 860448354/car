package com.example.car.model.pojos.dai;

import com.example.car.model.pojos.kj.Staff;
import com.example.car.model.pojos.kj.User;

import java.sql.Timestamp;
import java.util.List;

/*客户关怀表（customercare）*/
public class Customercare {
    private Integer custId;/*编号*/
    private String custTheme;/*关怀主题*/
    private Timestamp custTime;/*日期*/
    private String custContent;/*关怀内容*/
    private String custState;/*关怀状态*/
    private User custCzrid;/*操作人外键*/
    private Staff activityEmpid;/*员工外键*/
    private List<Carestaff> cares;/*客户关怀外键*/
    private Caretype custType;/*关怀类型外键*/

    @Override
    public String toString() {
        return "Customercare{" +
                "custId=" + custId +
                ", custTheme='" + custTheme + '\'' +
                ", custTime=" + custTime +
                ", custContent='" + custContent + '\'' +
                ", custState='" + custState + '\'' +
                ", custCzrid=" + custCzrid +
                ", activityEmpid=" + activityEmpid +
                ", cares=" + cares +
                ", custType=" + custType +
                '}';
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public Caretype getCustType() {
        return custType;
    }

    public void setCustType(Caretype custType) {
        this.custType = custType;
    }

    public Staff getActivityEmpid() {
        return activityEmpid;
    }

    public void setActivityEmpid(Staff activityEmpid) {
        this.activityEmpid = activityEmpid;
    }

    public User getCustCzrid() {
        return custCzrid;
    }

    public void setCustCzrid(User custCzrid) {
        this.custCzrid = custCzrid;
    }

    public List<Carestaff> getCares() {
        return cares;
    }

    public void setCares(List<Carestaff> cares) {
        this.cares = cares;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustTheme() {
        return custTheme;
    }

    public void setCustTheme(String custTheme) {
        this.custTheme = custTheme;
    }

    public Timestamp getCustTime() {
        return custTime;
    }

    public void setCustTime(Timestamp custTime) {
        this.custTime = custTime;
    }

    public String getCustContent() {
        return custContent;
    }

    public void setCustContent(String custContent) {
        this.custContent = custContent;
    }
}
