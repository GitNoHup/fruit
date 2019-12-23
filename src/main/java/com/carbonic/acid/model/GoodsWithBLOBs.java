package com.carbonic.acid.model;

import lombok.Data;

@Data
public class GoodsWithBLOBs extends Goods {
    private byte[] imageMain;

    private byte[] imageOne;

    private byte[] imageTwo;

    private byte[] imageThree;

    private byte[] imageFour;

    private byte[] imageFive;

}