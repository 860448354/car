package com.example.car.model.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PutSto {
    private int putStoId;
    private int purId;
    private Date putStoTime;
    private String putStoNum;
    private String putStoName;
    private Purchase purchase;
}
