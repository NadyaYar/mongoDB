package com.example.mongoDB.books.service.serviceImpl;

import com.example.mongoDB.books.entity.Book;
import com.example.mongoDB.books.entity.Category;
import com.example.mongoDB.books.exceptions.BookNotFoundException;
import com.example.mongoDB.books.repository.BookRepository;
import com.example.mongoDB.books.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Long save(Book book) {
        return bookRepository.save(book).getId();
    }

    @Override
    public Long deleteById(Long id) {
        bookRepository.deleteById(id);
        return id;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getByCategories(Category category) {
        return bookRepository.findAllByCategory(category);
    }

    @Override
    public List<Book> getByOrderRateDesc() {
        return bookRepository.findAllByOrderByRateDesc();
    }

    @Override
    @SneakyThrows
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book with id: " + id + "not found"));
    }
}
