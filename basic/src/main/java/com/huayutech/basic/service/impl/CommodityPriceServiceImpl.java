package com.huayutech.basic.service.impl;

import com.huayutech.basic.domain.Quotation;
import com.huayutech.basic.domain.QuotationDetails;
import com.huayutech.basic.domain.SKU;
import com.huayutech.basic.repository.QuotationDetailsRepository;
import com.huayutech.basic.repository.QuotationRepository;
import com.huayutech.basic.repository.SKURepository;
import com.huayutech.basic.service.CommodityPriceService;
import com.huayutech.basic.service.IdGeneratedService;
import com.huayutech.basic.vo.PeriodPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;
import java.util.Date;

@Service
public class CommodityPriceServiceImpl implements CommodityPriceService {

    @Autowired
    IdGeneratedService idGeneratedService;

    @Autowired
    QuotationRepository quotationRepository;

    @Autowired
    QuotationDetailsRepository quotationDetailsRepository;

    @Autowired
    SKURepository skuRepository;

    @Override
    public Long createQuotation(String name) {
        Quotation quotation = new Quotation();
        quotation.setId(idGeneratedService.generate());
        quotation.setName(name);
        quotationRepository.save(quotation);
        return quotation.getId();
    }

    @Override
    public void deleteQuotation(Long quotationId) {

        quotationRepository.deleteById(quotationId);
    }

    @Override
    public void renameQuotation(Long quotationId, String name) {
        Quotation quotation = quotationRepository
                .findById(quotationId)
                .orElseThrow(()-> new EntityNotFoundException(String.format("未能找到编号为No.%d的报价单", quotationId)));

        quotation.setName(name);
        quotationRepository.save(quotation);
    }

    @Override
    public Long addPeriodPrice(Long quotationId, Long SKUId, Date startDateTime, Date finishDateTime, Double price) {
        Quotation quotation = quotationRepository
                .findById(quotationId)
                .orElseThrow(()-> new EntityNotFoundException(String.format("未能找到编号为No.%d的报价单", quotationId)));
        SKU sku = skuRepository
                .findById(quotationId)
                .orElseThrow(()-> new EntityNotFoundException(String.format("未能找到编号为No.%d的商品", SKUId)));

        QuotationDetails quotationDetails = new QuotationDetails();
        quotationDetails.setId(idGeneratedService.generate());
        quotationDetails.setQuotation(quotation);
        quotationDetails.setSku(sku);
        quotationDetails.setStartTime(startDateTime);
        quotationDetails.setFinishTime(finishDateTime);
        quotationDetails.setPrice(price);
        quotationDetailsRepository.save(quotationDetails);
        return quotationDetails.getId();
    }

    @Override
    public void removePeriodPrice(Long periodPriceId) {
        quotationDetailsRepository.deleteById(periodPriceId);
    }

    @Override
    public Collection<PeriodPrice> getAllPeriodPriceOfQuotation(Long quotationId) {
        return null;
    }

    @Override
    public void removeAllPeriodPriceOfQuotation(Long quotationId) {

    }

    @Override
    public PeriodPrice findAvailablePeriodPriceOfQuotation(Long quotationId, Long SKUId) {
        return null;
    }
}
