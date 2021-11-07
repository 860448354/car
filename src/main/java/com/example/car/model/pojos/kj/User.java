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




}
