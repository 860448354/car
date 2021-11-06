package com.example.car.model.pojos.dai;

import java.sql.Timestamp;

/*客户回访计划表（Visit plan ）*/
public class Visitplan {
    private Integer clientId;/*编号*/
    private Timestamp clientTimestart;/*计划回访开始时间*/
    private Timestamp clientTimeend;/*计划回访结束时间*/
    private String clientGoal;/*回访目的*/
    /*private Integer clientId;客户外键*/

    @Override
    public String toString() {
        return "Visitplan{" +
                "clientId=" + clientId +
                ", clientTimestart=" + clientTimestart +
                ", clientTimeend=" + clientTimeend +
                ", clientGoal='" + clientGoal + '\'' +
                '}';
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Timestamp getClientTimestart() {
        return clientTimestart;
    }

    public void setClientTimestart(Timestamp clientTimestart) {
        this.clientTimestart = clientTimestart;
    }

    public Timestamp getClientTimeend() {
        return clientTimeend;
    }

    public void setClientTimeend(Timestamp clientTimeend) {
        this.clientTimeend = clientTimeend;
    }

    public String getClientGoal() {
        return clientGoal;
    }

    public void setClientGoal(String clientGoal) {
        this.clientGoal = clientGoal;
    }
}
