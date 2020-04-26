package com.huayutech.basic.mapper;

import com.huayutech.basic.vo.Commodity;
import com.huayutech.basic.vo.CommoditySearchCondition;
import com.huayutech.basic.vo.PeriodPrice;
import com.huayutech.basic.vo.PeriodPriceSearchCondition;

import java.util.List;

public interface CommodityMapper {

    List<Commodity> searchCommodity(CommoditySearchCondition condition);

    List<PeriodPrice> getCommodityPeriodPrices(PeriodPriceSearchCondition condition);

}
