package com.example.car.model.pojos.dai;

public class Memberdiscoupon {
    private Integer berdId;/*编号*/
    private Integer berdState ;/*状态*/
   /* private Integer berdId;客户编号
    private Integer berdId;会员折扣编号*/

    @Override
    public String toString() {
        return "Memberdiscoupon{" +
                "berdId=" + berdId +
                ", berdState=" + berdState +
                '}';
    }

    public Integer getBerdId() {
        return berdId;
    }

    public void setBerdId(Integer berdId) {
        this.berdId = berdId;
    }

    public Integer getBerdState() {
        return berdState;
    }

    public void setBerdState(Integer berdState) {
        this.berdState = berdState;
    }
}
