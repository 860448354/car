package com.example.car.model.pojos.dai;
/*投诉表*/
public class Complaint {
    private Integer comId;/*编号*/
    private String comName;/*投诉主题*/
    private String comResult;/*处理结果*/
    private String comRemark;/*备注*/
    /*private Integer comId;员工外键*/
    /*private Integer comId;客户外键*/
    /*private Integer comId;投诉类型外键*/

    @Override
    public String toString() {
        return "Complaint{" +
                "comId=" + comId +
                ", comName='" + comName + '\'' +
                ", comResult='" + comResult + '\'' +
                ", comRemark='" + comRemark + '\'' +
                '}';
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
