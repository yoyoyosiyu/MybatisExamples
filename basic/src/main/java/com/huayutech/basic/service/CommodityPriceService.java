package com.huayutech.basic.service;

import com.huayutech.basic.vo.PeriodPrice;

import java.util.Collection;
import java.util.Date;

/**
 * 商品的价格服务
 */
public interface CommodityPriceService {

    /**
     * 创建一个报价单
     * @param name 报价单的名字
     * @return 报价单的Id标识
     */
    Long createQuotation(String name);

    /**
     * 删除报价单
     * @param quotationId 报价单的Id标识
     */
    void deleteQuotation(Long quotationId);

    /**
     * 更改一份报价单的名称
     * @param quotationId 报价单的Id标识
     * @param name 新改的报价单名称
     */
    void renameQuotation(Long quotationId, String name);

    /**
     * 增加一项新的周期报价到已有的报价单中
     * @param quotationId 报价单的Id标识
     * @param SKUId 商品的SKU标识
     * @param startDateTime 价格的开始生效时间
     * @param finishDateTime 价格的失效时间
     * @param price 价格
     * @return 周期报价的Id标识
     */
    Long addPeriodPrice(Long quotationId, Long SKUId, Date startDateTime,
                               Date finishDateTime, Double price);

    /**
     * 删除一项周期报价
     * @param periodPriceId 周期报价的Id标识
     */
    void removePeriodPrice(Long periodPriceId);

    /**
     * 返回指定的报价单的所有的周期报价信息
     * @param quotationId 报价单的Id标识
     * @param skuId 商品的SKU标识
     * @return 周期报价列表
     */
    Collection<PeriodPrice> getAllPeriodPriceOfQuotation(Long quotationId, Long skuId);

    /**
     * 删除指定报价单的所有周期报价信息
     * @param quotationId 报价单的Id标识
     */
    void removeAllPeriodPriceOfQuotation(Long quotationId);

    /**
     * 查找指定报价单中指定商品的有效周期报价
     * @param quotationId 报价单的Id标识
     * @param SKUId 商品SKU的Id标识
     * @return 周期报价的Id标识
     */
    PeriodPrice findAvailablePeriodPriceOfQuotation(Long quotationId, Long SKUId);
}
