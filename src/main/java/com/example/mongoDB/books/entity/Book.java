package com.example.mongoDB.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @UniqueElements
    private Long id;

    private String name;

    private Category category;

    private String author;

    private String description;

    private Rate rate;
}
