package com.example.car.vojo.czh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaintVo {
    private Integer sfId;
    private Integer carMessageId;
    private Date paiGongTime;
    private String State = "完成派工";
    private Integer crId;
}
