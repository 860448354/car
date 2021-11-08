package com.example.car.model.pojos.dai;

public class Emergency {
    private Integer emerId;
    private String emerName;

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
