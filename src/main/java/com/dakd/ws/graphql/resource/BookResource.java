package com.dakd.ws.graphql.resource;

import com.dakd.ws.graphql.service.BookService;
import com.dakd.ws.graphql.service.GraphQLService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {
    @Autowired
    GraphQLService graphQLService;
    @Autowired
    BookService bookService;

    @PostMapping("/rest/books")
    public ResponseEntity<Object> getAllBooks(@RequestBody String query) {
        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }

    @PostMapping("/rest/save")
    public void saveBooks() {
        bookService.insertBook();
    }
}
