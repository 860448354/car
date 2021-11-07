package com.example.car.model.pojos.kj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private Integer uId;
  private String uAccount;
  private String uPwd;
  private Integer uSid;
  private Staff myStaff;

  public Integer getuId() {
    return uId;
  }

  public void setuId(Integer uId) {
    this.uId = uId;
  }

  public String getuAccount() {
    return uAccount;
  }

  public void setuAccount(String uAccount) {
    this.uAccount = uAccount;
  }

  public String getuPwd() {
    return uPwd;
  }

  public void setuPwd(String uPwd) {
    this.uPwd = uPwd;
  }

  public Integer getuSid() {
    return uSid;
  }

  public void setuSid(Integer uSid) {
    this.uSid = uSid;
  }

  public Staff getMyStaff() {
    return myStaff;
  }

  public void setMyStaff(Staff myStaff) {
    this.myStaff = myStaff;
  }
}
