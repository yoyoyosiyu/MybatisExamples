package com.huayutech.basic.service;

import com.huayutech.basic.vo.Commodity;

import java.util.List;

public interface CommoditySearchService {

    List<Commodity> searchCommodity(String keyword, Long quotationId);
}
