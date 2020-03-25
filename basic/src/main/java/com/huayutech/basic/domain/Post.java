package com.huayutech.basic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Setter
@Getter
@Entity
public class Post {

    @Id
    Long id;

    @Column(unique = false)
    String title;

    @ManyToOne
    User user;

}
