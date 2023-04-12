package com.mhotel.dao.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Order extends BaseEntity {

    private LocalDate dateSettlement;

    private LocalDate dateFree;

    private Guest guest;

    private Room room;

    private List<Facility> facilities;
}
