package com.us.commerceI.dto.data;

import com.us.commerceI.entity.GoodImg;
import com.us.commerceI.entity.Goods;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author codeY
 * @version 1.0
 * @date 2021/3/2 12:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsDetail extends Goods {
    @ApiModelProperty("物品的详细图片地址")
    private List<GoodImg> detailImages;
}
