package com.us.commerceI.dto.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author codeY
 * @version 1.0
 * @date 2021/3/2 12:30
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "列出商品的请求对象")
public class ListGoodsQuery {
    @ApiModelProperty(value = "当前页,不写默认为第一页",example = "1")
    private Integer currentPage;
    @ApiModelProperty(value = "当前页的数据条数，不写默认为三条",example = "3")
    private Integer size;
}
