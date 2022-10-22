package com.example.mongoDB.books.entity;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Rate {
    @Size(min = 1, max = 5)
    private int value;
    private int countOfVotes;
}
