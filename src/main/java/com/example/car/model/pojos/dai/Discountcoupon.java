package com.example.car.model.pojos.dai;

import java.math.BigDecimal;

/*优惠券表（discountcoupon）*/
public class Discountcoupon {
    private Integer disId;/*编号*/
    private String disName;/*优惠券名称*/
    private BigDecimal disFacevalue;/*面值*/

    @Override
    public String toString() {
        return "Discountcoupon{" +
                "disId=" + disId +
                ", disName='" + disName + '\'' +
                ", disFacevalue=" + disFacevalue +
                '}';
    }

    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public BigDecimal getDisFacevalue() {
        return disFacevalue;
    }

    public void setDisFacevalue(BigDecimal disFacevalue) {
        this.disFacevalue = disFacevalue;
    }
}
