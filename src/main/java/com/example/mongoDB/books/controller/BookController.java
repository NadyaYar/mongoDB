package com.example.mongoDB.books.controller;

import com.example.mongoDB.books.entity.Book;
import com.example.mongoDB.books.entity.Category;
import com.example.mongoDB.books.service.serviceImpl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookServiceImpl bookService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public long saveBook(@RequestBody Book book) {
        bookService.save(book);
        return book.getId();
    }

    @DeleteMapping("/delete")
    public long deleteBook(@PathVariable Long id) {
        return bookService.deleteById(id);
    }

    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }


    @GetMapping("/getById")
    public Book getByIdBook(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/getByOrderRateDesc")
    public List<Book> getByOrderRateDesc() {
        return bookService.getByOrderRateDesc();
    }

    @GetMapping("/getByCategory")
    public List<Book> getByCategory(@PathVariable Category category) {
        return bookService.getByCategories(category);
    }
}
