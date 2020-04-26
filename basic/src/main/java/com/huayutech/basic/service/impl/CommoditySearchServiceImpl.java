package com.huayutech.basic.service.impl;

import com.huayutech.basic.mapper.CommodityMapper;
import com.huayutech.basic.service.CommoditySearchService;
import com.huayutech.basic.vo.Commodity;
import com.huayutech.basic.vo.CommoditySearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommoditySearchServiceImpl implements CommoditySearchService {

    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> searchCommodity(String keyword, Long quotationId) {
        CommoditySearchCondition condition = new CommoditySearchCondition();
        condition.setKeyword(keyword);
        condition.setQuotationId(quotationId);

        return commodityMapper.searchCommodity(condition);
    }
}
