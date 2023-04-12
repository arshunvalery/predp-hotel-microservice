package com.mhotel.dao.model;

import com.mhotel.dao.model.enums.RoomStatus;
import lombok.Data;

import javax.persistence.*;

@Data
public class Room extends BaseEntity{
    private String number;
    @Enumerated(EnumType.STRING)
    private RoomStatus status;
    private int price;
}
