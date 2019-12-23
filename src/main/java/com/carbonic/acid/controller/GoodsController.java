package com.carbonic.acid.controller;

import com.carbonic.acid.model.GoodsWithBLOBs;
import com.carbonic.acid.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 操作商品的controller层
 * @author yu xin
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/searchGoods")
    public List<GoodsWithBLOBs> searchGood(){
        return goodsService.searchGood();
    }

    @RequestMapping("/addGoods")
    public void addGoods(@RequestBody GoodsWithBLOBs goodsWithBLOBs){
        goodsService.addGoods(goodsWithBLOBs);
    }

    @RequestMapping("/updateGoods")
    public void updateGoods(@RequestBody GoodsWithBLOBs goodsWithBLOBs){
        goodsService.updateGoods(goodsWithBLOBs);
    }

    @RequestMapping("/deleteGoods")
    public void deleteGoods(@RequestParam String goodId){
        goodsService.deleteGoods(goodId);
    }

}
