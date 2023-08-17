package com.dakd.ws.graphql.service.datafetcher;

import com.dakd.ws.graphql.models.Book;
import com.dakd.ws.graphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher implements DataFetcher<Book> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book get(DataFetchingEnvironment environment) throws Exception {
        String isbn = environment.getArgument("id");
        return bookRepository.findById(isbn).get();
    }
}
