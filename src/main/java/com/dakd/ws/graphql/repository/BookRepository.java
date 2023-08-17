package com.dakd.ws.graphql.repository;

import com.dakd.ws.graphql.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
