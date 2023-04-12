package com.mhotel.dao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Facility extends BaseEntity {
    private String title;
    private int price;

}
