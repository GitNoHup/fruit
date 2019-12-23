package com.carbonic.acid.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Goods {
    private String goodId;

    private String goodName;

    private BigDecimal unitPrice;

    private String stock;

    private String goodType;

    private String descript;

    private Date createTime;

    private Date modifyTime;

}