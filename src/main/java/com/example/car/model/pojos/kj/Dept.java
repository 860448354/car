package com.example.car.model.pojos.kj;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Dept {

  private Integer dtId;
  private String dtName;

  private List<Post> mypost;



}
