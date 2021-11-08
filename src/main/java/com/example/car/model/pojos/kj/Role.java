package com.example.car.model.pojos.kj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {

  private Integer rId;
  private String rName;

  private List<Staff> myStaff;




}
