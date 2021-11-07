package com.example.car.model.pojos.kj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

  private Integer sfId;
  private String sfName;
  private String sfPhone;
  private String sfCard;
  private Integer sfState;
  private Integer sfDpid;
  private Integer sfPtid;

  private Dept mydept;
  private Post mypost;
  private User myuser;
  private List<Role>myRoles;


  private String user;
  private String pwd;



}
