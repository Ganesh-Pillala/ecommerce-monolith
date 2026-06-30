package com.trial.ecommerce.entity;

//import jakarta.persistence.Id;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
public class Review {

    @Id
    private String id;

    private Long productId;

    private Long userId;

    private Integer rating;

    private String comment;

    private LocalDateTime createdAt;
}