package com.dev.reactive.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(value = "product")
public class Product {

    @Id
    @Column(value = "id")
    private Integer id;

    @Column(value = "productname")
    private String productName;

    @Column(value = "price")
    private Integer price;
}
