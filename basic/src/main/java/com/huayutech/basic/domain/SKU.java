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

    @ManyToOne
    SPU spu;

    @Column
    String name;

}
