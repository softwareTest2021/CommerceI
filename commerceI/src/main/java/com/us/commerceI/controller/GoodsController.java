package com.us.commerceI.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.us.commerceI.entity.ApiResponse;
import com.us.commerceI.entity.Goods;
import com.us.commerceI.dto.data.GoodsDetail;
import com.us.commerceI.dto.query.ListGoodsQuery;
import com.us.commerceI.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器git
 * </p>
 *
 * @author us
 * @since 2021-03-01
 */
@RestController
@RequestMapping("/commerceI/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @ApiOperation(value = "列出当前页的商品")
    @GetMapping("/listGoods")
    public ApiResponse listGoods(@RequestBody(required = false) ListGoodsQuery listGoodsQuery){
        if (listGoodsQuery == null){
            listGoodsQuery = new ListGoodsQuery();
            listGoodsQuery.setCurrentPage(1);
            listGoodsQuery.setSize(3);
        }
        if (listGoodsQuery.getCurrentPage()==null){
            listGoodsQuery.setCurrentPage(1);
        }
        if (listGoodsQuery.getSize()==null){
            listGoodsQuery.setSize(3);
        }
        IPage<Goods> pageGoods = new Page<>(listGoodsQuery.getCurrentPage(),listGoodsQuery.getSize());
        goodsService.page(pageGoods,null);
        return ApiResponse.ok().data("items",pageGoods);
    }
    @GetMapping("/goodsDetail")
    @ApiOperation("查询单个商品的详细信息")
    public ApiResponse goodsDetail(@ApiParam(name = "gid",value = "商品id",example = "1",required = true) @RequestParam(name = "gid") Long gid){
        if (gid==null){
            return ApiResponse.error();
        }else{
            GoodsDetail goodsDetail = goodsService.getDetailById(gid);
            return ApiResponse.ok().data("item",goodsDetail);
        }

    }
}

