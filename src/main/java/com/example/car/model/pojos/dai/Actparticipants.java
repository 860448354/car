package com.example.car.model.pojos.dai;

import com.example.car.model.pojos.czh.Customer;

/*活动参与人员表*/
public class Actparticipants {
    private Integer panId;/*编号*/
    private Activity panActId;/*活动表编号*/
    private Customer panMemId;/*客户编号*/

    @Override
    public String toString() {
        return "Actparticipants{" +
                "panId=" + panId +
                ", panActId=" + panActId +
                ", pan_MemId=" + panMemId +
                '}';
    }

    public Activity getPanActId() {
        return panActId;
    }

    public void setPanActId(Activity panActId) {
        this.panActId = panActId;
    }

    public Customer getPanMemId() {
        return panMemId;
    }

    public void setPanMemId(Customer panMemId) {
        this.panMemId = panMemId;
    }

    public Integer getPanId() {
        return panId;
    }

    public void setPanId(Integer panId) {
        this.panId = panId;
    }
}
