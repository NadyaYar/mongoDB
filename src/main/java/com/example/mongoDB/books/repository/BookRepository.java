package com.example.mongoDB.books.repository;

import com.example.mongoDB.books.entity.Book;
import com.example.mongoDB.books.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {

    List<Book> findAllByCategory(Category category);

    List<Book> findAllByOrderByRateDesc();
}
