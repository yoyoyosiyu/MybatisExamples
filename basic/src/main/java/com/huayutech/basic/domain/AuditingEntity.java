package com.huayutech.basic.domain;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
public class AuditingEntity<U> {

    @CreatedBy
    private U createdBy;

    @CreatedDate
    private Date createdDate;

    @LastModifiedBy
    private U modifiedBy;

    @LastModifiedDate
    private Date modifiedDate;

}
