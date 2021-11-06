package com.example.car.model.pojos.dai;

import java.sql.Timestamp;

/*客户关怀表（customercare）*/
public class Customercare {
    private Integer custId;/*编号*/
    private String custTheme;/*关怀主题*/
    private Timestamp custTime;/*日期*/
    private String custContent;/*关怀内容*/

    @Override
    public String toString() {
        return "Customercare{" +
                "custId=" + custId +
                ", custTheme='" + custTheme + '\'' +
                ", custTime=" + custTime +
                ", custContent='" + custContent + '\'' +
                '}';
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
