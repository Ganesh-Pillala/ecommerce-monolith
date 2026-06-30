package com.trial.ecommerce.entity;

//import jakarta.persistence.Id;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Document(collection = "activity_logs")
public class ActivityLog {

    @Id
    private String id;

    private Long userId;

    private String event;

    private Map<String, Object> details;

    private LocalDateTime timestamp;
}