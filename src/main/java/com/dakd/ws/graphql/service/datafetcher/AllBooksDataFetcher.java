package com.dakd.ws.graphql.service.datafetcher;

import com.dakd.ws.graphql.models.Book;
import com.dakd.ws.graphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>> {

    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> get(DataFetchingEnvironment environment) throws Exception {
        return bookRepository.findAll();
    }
}
