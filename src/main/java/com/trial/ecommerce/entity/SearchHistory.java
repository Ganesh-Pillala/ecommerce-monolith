package com.trial.ecommerce.entity;

//import jakarta.persistence.Id;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "search_history")
public class SearchHistory {

    @Id
    private String id;

    private Long userId;

    private String keyword;

    private LocalDateTime searchedAt;
}