package com.example.car.model.pojos.dai;

/*活动参与人员表*/
public class Actparticipants {
    private Integer panId;/*编号*/
    /*private Integer panId;活动表编号*/
    /*private Integer panId;客户编号*/

    @Override
    public String toString() {
        return "Actparticipants{" +
                "panId=" + panId +
                '}';
    }

    public Integer getPanId() {
        return panId;
    }

    public void setPanId(Integer panId) {
        this.panId = panId;
    }
}
