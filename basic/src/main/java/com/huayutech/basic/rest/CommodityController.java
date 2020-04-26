package com.huayutech.basic.rest;

import com.huayutech.basic.service.CommodityPriceService;
import com.huayutech.basic.service.CommoditySearchService;
import com.huayutech.basic.service.CommodityService;
import com.huayutech.basic.vo.Commodity;
import com.huayutech.basic.vo.PeriodPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/commodities")
public class CommodityController {

    @Autowired
    CommoditySearchService commoditySearchService;

    @Autowired
    CommodityPriceService commodityPriceService;

    @GetMapping
    public Collection<Commodity> getCommodities(@RequestParam(required = false) String keyword, @RequestParam(required = false) Long quotationId) {
        return commoditySearchService.searchCommodity(keyword, quotationId);
    }

    @GetMapping("/{commodityId}/period_prices")
    public Collection<PeriodPrice> getCommodityPeriodPrices(@PathVariable Long commodityId, @RequestParam Long quotationId) {
        return commodityPriceService.getAllPeriodPriceOfQuotation(quotationId, commodityId);
    }

}
