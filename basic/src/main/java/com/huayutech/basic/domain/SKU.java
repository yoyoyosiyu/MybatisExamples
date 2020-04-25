package com.huayutech.basic.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class SKU extends AuditingEntity<String> {
    @Id
    Long id;

    @ManyToOne(optional = false)
    SPU spu;

    // 规格
    @Column(nullable = false)
    String specifications;

    // 价格
    Double price;
}
