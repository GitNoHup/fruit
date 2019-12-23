package com.carbonic.acid.mapper;

import com.carbonic.acid.model.Goods;
import com.carbonic.acid.model.GoodsWithBLOBs;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(String goodId);

    int insert(GoodsWithBLOBs record);

    int insertSelective(GoodsWithBLOBs record);

    GoodsWithBLOBs selectByPrimaryKey(String goodId);

    List<GoodsWithBLOBs> selectAll();

    int updateByPrimaryKeySelective(GoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsWithBLOBs record);

    int updateByPrimaryKey(Goods record);
}