package com.trial.ecommerce.entity;

//import jakarta.persistence.Id;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "product_specifications")
public class ProductSpecification {

    @Id
    private String id;

    private Long productId;

    private Map<String, String> specifications;
}