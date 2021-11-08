package com.example.car.model.pojos.dai;

import com.example.car.model.pojos.czh.Customer;

/*客户关怀人员表（Carestaff）*/
public class Carestaff {
    private Integer careId;/*编号*/
    private Customer careCus;/*客户外键*/
    private Customercare careCustom;/*客户关怀外键*/

    @Override
    public String toString() {
        return "Carestaff{" +
                "careId=" + careId +
                ", careCus=" + careCus +
                ", careCustom=" + careCustom +
                '}';
    }
    public Customer getCareCus() {
        return careCus;
    }

    public void setCareCus(Customer careCus) {
        this.careCus = careCus;
    }

    public Customercare getCareCustom() {
        return careCustom;
    }

    public void setCareCustom(Customercare careCustom) {
        this.careCustom = careCustom;
    }

    public Integer getCareId() {
        return careId;
    }

    public void setCareId(Integer careId) {
        this.careId = careId;
    }
}
