package com.huayutech.basic.vo;

import lombok.Data;

@Data
public class Commodity {

    Long    globalSPUId;
    Long    SPUId;
    Long    SKUId;

    String  name;
    String  alias;
    String  specifications;
    Double  price;
    Long    quotationId;
    Double  quotationPrice;

}
