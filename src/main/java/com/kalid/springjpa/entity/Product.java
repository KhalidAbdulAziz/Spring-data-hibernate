package com.kalid.springjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Product {

    @Id
    private int pid;
    private String productName;
    private int qty;
    private int price;
}
