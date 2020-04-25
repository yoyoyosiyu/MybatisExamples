package com.huayutech.basic.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class GlobalSPU extends AuditingEntity<String> {

    @Id
    Long id;

    @Column
    String name;
}
