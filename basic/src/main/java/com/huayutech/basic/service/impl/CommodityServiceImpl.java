package com.huayutech.basic.service.impl;

import com.huayutech.basic.domain.GlobalSPU;
import com.huayutech.basic.domain.SKU;
import com.huayutech.basic.domain.SPU;
import com.huayutech.basic.repository.SKURepository;
import com.huayutech.basic.repository.SPURepository;
import com.huayutech.basic.repository.GlobalSPURepository;
import com.huayutech.basic.service.CommodityService;
import com.huayutech.basic.service.IdGeneratedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    GlobalSPURepository globalSPURepository;

    @Autowired
    SPURepository spuRepository;

    @Autowired
    SKURepository skuRepository;

    @Autowired
    IdGeneratedService idGeneratedService;

    @Override
    public Long createGlobalSPU(String name) {

        GlobalSPU globalSPU = new GlobalSPU();
        globalSPU.setId(idGeneratedService.generate());
        globalSPU.setName(name);

        globalSPURepository.save(globalSPU);
        return globalSPU.getId();
    }

    @Override
    public Long createSPU(Long globalSPUId, String alias) {
        GlobalSPU globalSPU = globalSPURepository
                .findById(globalSPUId)
                .orElseThrow(()-> new EntityNotFoundException(String.format("未能找到编号为No.%d的系统商品", globalSPUId)));

        SPU spu = new SPU();

        spu.setId(idGeneratedService.generate());
        spu.setGlobalSPU(globalSPU);
        spu.setAlias(alias);
        spuRepository.save(spu);
        return spu.getId();
    }

    @Override
    public Long createSKU(Long SPUId, String name) {

        SPU spu = spuRepository
                .findById(SPUId)
                .orElseThrow(()-> new EntityNotFoundException(String.format("未能找到编号为No.%d的商品", SPUId)));

        SKU sku = new SKU();
        sku.setId(idGeneratedService.generate());
        sku.setSpu(spu);
        sku.setName(name);
        skuRepository.save(sku);

        return sku.getId();
    }

    @Override
    public void deleteSKU(Long SKUId) {

    }

    @Override
    public void deleteSPU(Long SPUId) {

    }

    @Override
    public void deleteGlobalSPU(Long SystemSPUId) {

    }

    @Override
    public void updateGlobalSPU(Long SystemSPUID, String name) {

    }

    @Override
    public void updateSPU(Long SPUId, String alias) {

    }

    @Override
    public void updateSKU(Long SKUId, String name) {

    }
}
