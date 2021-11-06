package com.example.car.model.pojos.dai;

/*活动类型表*/
public class Activitytype {
    private Integer atypeId; /*编号*/
    private String atypeName; /*活动名称*/


    @Override
    public String toString() {
        return "Activitytype{" +
                "atypeId=" + atypeId +
                ", atypeName='" + atypeName + '\'' +
                '}';
    }

    public Integer getAtypeId() {
        return atypeId;
    }

    public void setAtypeId(Integer atypeId) {
        this.atypeId = atypeId;
    }

    public String getAtypeName() {
        return atypeName;
    }

    public void setAtypeName(String atypeName) {
        this.atypeName = atypeName;
    }
}
