package com.huayutech.basic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class User {

    @Id
    Long id;

    @Column
    String name;

}
