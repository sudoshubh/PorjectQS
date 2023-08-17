package com.example.Project_One.repository;

import com.example.Project_One.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepo extends MongoRepository<Book, Integer> {
    Book save(Book book);

    List<Book> findAll();
}
