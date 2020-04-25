package com.huayutech.basic.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class SPU extends AuditingEntity<String> {

    @Id
    Long id;

    @Column
    String alias;

    @ManyToOne
    GlobalSPU globalSPU;


}
