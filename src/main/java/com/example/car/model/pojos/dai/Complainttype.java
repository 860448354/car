package com.example.car.model.pojos.dai;

/*投诉类型表（complainttype）*/
public class Complainttype {
    private Integer complainId;/*编号*/
    private Integer complainName;/*投诉类型名称*/

    @Override
    public String toString() {
        return "Complainttype{" +
                "complainId=" + complainId +
                ", complainName=" + complainName +
                '}';
    }

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public Integer getComplainName() {
        return complainName;
    }

    public void setComplainName(Integer complainName) {
        this.complainName = complainName;
    }
}
