package com.example.car.model.pojos.kj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jurisdiction {

  private Integer jId;
  private String jName;
  private String component;
  private String url;
  private String jFunction;
  private String jImg;
  private Integer jState;
  private Integer jUpid;

  private List<Jurisdiction> myJurisdiction;




}
