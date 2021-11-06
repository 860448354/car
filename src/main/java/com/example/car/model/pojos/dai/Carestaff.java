package com.example.car.model.pojos.dai;

/*客户关怀人员表（Carestaff）*/
public class Carestaff {
    private Integer careId;/*编号*/
   /* private Integer careId;客户外键
    private Integer careId;客户关怀外键*/

    @Override
    public String toString() {
        return "Carestaff{" +
                "careId=" + careId +
                '}';
    }

    public Integer getCareId() {
        return careId;
    }

    public void setCareId(Integer careId) {
        this.careId = careId;
    }
}
