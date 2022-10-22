package com.example.mongoDB.books.service;

import com.example.mongoDB.books.entity.Book;
import com.example.mongoDB.books.entity.Category;

import java.util.List;

public interface BookService {
    Long save(Book book);

    Long deleteById(Long id);

    List<Book> getAllBooks();

    List<Book> getByCategories(Category category);

    List<Book> getByOrderRateDesc();

    Book getBookById(Long id);

}
