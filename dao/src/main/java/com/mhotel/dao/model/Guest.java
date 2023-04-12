package com.mhotel.dao.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "guests")
public class Guest extends BaseEntity{
    private String name;
    private String surname;
    private String tel;
    private int age;
    private String gender;
    private int cash;
}
