package com.example.car.model.pojos.dai;

public class Caretype {
    private Integer ctypeId;
    private String  ctypeName;

    @Override
    public String toString() {
        return "Caretype{" +
                "ctypeId=" + ctypeId +
                ", ctypeName='" + ctypeName + '\'' +
                '}';
    }

    public Integer getCtypeId() {
        return ctypeId;
    }

    public void setCtypeId(Integer ctypeId) {
        this.ctypeId = ctypeId;
    }

    public String getCtypeName() {
        return ctypeName;
    }

    public void setCtypeName(String ctypeName) {
        this.ctypeName = ctypeName;
    }
}
