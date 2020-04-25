package com.huayutech.basic.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Quotation {

    @Id
    Long id;

    @Column
    String name;

}
