package com.example.car.vojo.dai;

import com.example.car.model.pojos.dai.Carestaff;
import com.example.car.model.pojos.dai.Caretype;
import com.example.car.model.pojos.kj.User;

import java.sql.Timestamp;
import java.util.List;

public class CustomercareVo {
    private Integer custId;/*编号*/
    private String custTheme;/*关怀主题*/
    private Timestamp custTime;/*日期*/
    private String custContent;/*关怀内容*/
    private String custState;/*关怀状态*/
    private User custCzrid;/*操作人外键*/
    private List<Carestaff> cares;/*客户关怀外键*/
    private List fruitesis;
    private Caretype custType;/*关怀类型外键*/

    @Override
    public String toString() {
        return "CustomercareVo{" +
                "custId=" + custId +
                ", custTheme='" + custTheme + '\'' +
                ", custTime=" + custTime +
                ", custContent='" + custContent + '\'' +
                ", custState='" + custState + '\'' +
                ", custCzrid=" + custCzrid +
                ", cares=" + cares +
                ", fruitesis=" + fruitesis +
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

    public List getFruitesis() {
        return fruitesis;
    }

    public void setFruitesis(List fruitesis) {
        this.fruitesis = fruitesis;
    }
}
