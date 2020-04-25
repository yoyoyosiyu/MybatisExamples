package com.huayutech.basic.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Entity
public class QuotationDetails extends AuditingEntity<String> {

    @Id
    Long id;

    @ManyToOne
    Quotation quotation;

    @ManyToOne
    SKU sku;

    @Column
    Date startTime;

    @Column
    Date finishTime;

    @Column
    Double price;

}
