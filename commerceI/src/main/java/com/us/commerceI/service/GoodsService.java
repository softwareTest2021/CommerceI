package com.us.commerceI.service;

import com.us.commerceI.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.us.commerceI.dto.data.GoodsDetail;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author us
 * @since 2021-03-01
 */
public interface GoodsService extends IService<Goods> {

    /**
     * 根据id查询详细的商品信息
     * @param gid 商品的id
     * @return 商品的详细信息对象
     */
    GoodsDetail getDetailById(long gid);
}
