package com.huayutech.basic.service;

public interface CommodityService {

    public Long createGlobalSPU(String name);

    public Long createSPU(Long SystemSPUId, String alias);

    public Long createSKU(Long SPUId, String name);

    public void deleteSKU(Long SKUId);

    public void deleteSPU(Long SPUId);

    public void deleteGlobalSPU(Long SystemSPUId);

    public void updateGlobalSPU(Long SystemSPUID, String name);

    public void updateSPU(Long SPUId, String alias);

    public void updateSKU(Long SKUId, String name);

}
