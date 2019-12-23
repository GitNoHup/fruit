package com.carbonic.acid.service;

import com.carbonic.acid.mapper.GoodsMapper;
import com.carbonic.acid.model.GoodsWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    public List<GoodsWithBLOBs> searchGood(){
        return goodsMapper.selectAll();
    }

    public void addGoods(GoodsWithBLOBs goodsWithBLOBs){
        goodsMapper.insertSelective(goodsWithBLOBs);
    }

    public void updateGoods(GoodsWithBLOBs goodsWithBLOBs){
        goodsMapper.updateByPrimaryKeySelective(goodsWithBLOBs);
    }

    public void deleteGoods(String goodId){
        goodsMapper.deleteByPrimaryKey(goodId);
    }
}
