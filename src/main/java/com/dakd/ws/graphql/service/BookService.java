package com.dakd.ws.graphql.service;

import com.dakd.ws.graphql.models.Book;
import com.dakd.ws.graphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void insertBook() {
        Stream.of(
                new Book("123", "Java programming", "Danushka", new String[] {"ABC"}, "2023-04-10"),
                new Book("124", "Python programming", "Nayomi", new String[] {"Samudra", "Sarasavi"}, "2023-10-20")
        ).forEach(book -> {
            bookRepository.save(book);
        });
    }
}
