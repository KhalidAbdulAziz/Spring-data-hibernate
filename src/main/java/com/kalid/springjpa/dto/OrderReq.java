package com.kalid.springjpa.dto;

import com.kalid.springjpa.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderReq {
    private Customer customer;
}
