package com.example.car.model.pojos.dai;

import com.example.car.model.pojos.czh.Customer;
import com.example.car.model.pojos.kj.Staff;

import java.sql.Timestamp;

/*投诉表*/
public class Complaint {
    private Integer comId;/*编号*/
    private String comName;/*投诉主题*/
    private String comResult;/*处理结果*/
    private String comRemark;/*备注*/
    private Timestamp comTime;/*投诉时间*/
    private Staff comSta;/*员工外键*/
    private Customer comCustomer;/*客户外键*/
    private Complainttype comType;/*投诉类型外键*/
    private Emergency comEmer;/*紧急程度外键*/

    @Override
    public String toString() {
        return "Complaint{" +
                "comId=" + comId +
                ", comName='" + comName + '\'' +
                ", comResult='" + comResult + '\'' +
                ", comRemark='" + comRemark + '\'' +
                ", com_time=" + comTime +
                ", comSta=" + comSta +
                ", comCustomer=" + comCustomer +
                ", comType=" + comType +
                ", comEmer=" + comEmer +
                '}';
    }

    public Timestamp getComTime() {
        return comTime;
    }

    public void setComTime(Timestamp comTime) {
        this.comTime = comTime;
    }

    public Staff getComSta() {
        return comSta;
    }

    public void setComSta(Staff comSta) {
        this.comSta = comSta;
    }

    public Customer getComCustomer() {
        return comCustomer;
    }

    public void setComCustomer(Customer comCustomer) {
        this.comCustomer = comCustomer;
    }

    public Complainttype getComType() {
        return comType;
    }

    public void setComType(Complainttype comType) {
        this.comType = comType;
    }

    public Emergency getComEmer() {
        return comEmer;
    }

    public void setComEmer(Emergency comEmer) {
        this.comEmer = comEmer;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComResult() {
        return comResult;
    }

    public void setComResult(String comResult) {
        this.comResult = comResult;
    }

    public String getComRemark() {
        return comRemark;
    }

    public void setComRemark(String comRemark) {
        this.comRemark = comRemark;
    }
}
