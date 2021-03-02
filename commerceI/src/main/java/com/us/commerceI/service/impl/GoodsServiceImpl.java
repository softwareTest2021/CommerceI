package com.us.commerceI.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.us.commerceI.entity.GoodImg;
import com.us.commerceI.entity.Goods;
import com.us.commerceI.entity.GoodsDetail;
import com.us.commerceI.mapper.GoodImgMapper;
import com.us.commerceI.mapper.GoodsMapper;
import com.us.commerceI.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author us
 * @since 2021-03-01
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
    @Autowired
    GoodImgMapper goodImgMapper;

    @Override
    public GoodsDetail getDetailById(long gid) {
        Goods byId = getById(gid);
        GoodsDetail goodsDetail = new GoodsDetail();
        if (byId!=null) {
            BeanUtils.copyProperties(byId, goodsDetail);
            QueryWrapper<GoodImg> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("g_id",gid);
            goodsDetail.setDetailImages(goodImgMapper.selectList(queryWrapper));
        }
        return goodsDetail;

    }
}
