package com.example.car.model.pojos.dai;

import java.math.BigDecimal;

/*会员折扣表（Memberdiscount）*/
public class Memberdiscount {
    private Integer berdId;/*编号*/
    private BigDecimal berdName;/*折扣*/

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

    public BigDecimal getBerdName() {
        return berdName;
    }

    public void setBerdName(BigDecimal berdName) {
        this.berdName = berdName;
    }
}
