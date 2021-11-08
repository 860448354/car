package com.example.car.model.pojos.dai;

public class Emergency {
    private Integer emerId;/*编号*/
    private String emerName;/*名称*/

    @Override
    public String toString() {
        return "Emergency{" +
                "emerId=" + emerId +
                ", emerName='" + emerName + '\'' +
                '}';
    }

    public Integer getEmerId() {
        return emerId;
    }

    public void setEmerId(Integer emerId) {
        this.emerId = emerId;
    }

    public String getEmerName() {
        return emerName;
    }

    public void setEmerName(String emerName) {
        this.emerName = emerName;
    }
}
