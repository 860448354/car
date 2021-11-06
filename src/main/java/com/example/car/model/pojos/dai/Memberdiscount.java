package com.example.car.model.pojos.dai;
/*会员折扣表（Memberdiscount）*/
public class Memberdiscount {
    private Integer berdId;/*编号*/
    private String berdName;/*折扣*/

    @Override
    public String toString() {
        return "Memberdiscount{" +
                "berdId=" + berdId +
                ", berdName='" + berdName + '\'' +
                '}';
    }

    public Integer getBerdId() {
        return berdId;
    }

    public void setBerdId(Integer berdId) {
        this.berdId = berdId;
    }

    public String getBerdName() {
        return berdName;
    }

    public void setBerdName(String berdName) {
        this.berdName = berdName;
    }
}
