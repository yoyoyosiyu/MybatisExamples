package com.huayutech.basic.vo;

import lombok.Data;

import java.util.Date;

@Data
public class PeriodPrice {

    String id;
    Date startTime;
    Date finishTime;
    Double price;
}
