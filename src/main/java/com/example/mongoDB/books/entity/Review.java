package com.example.mongoDB.books.entity;

import lombok.Data;

@Data
public class Review {
    private long movieId;
    private String reviewMessage;
    private boolean isLike;
    private long userId;
}
