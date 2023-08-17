package com.dakd.ws.graphql.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    private String isbn;
    private String title;
    private String publisher;
    private String[] authors;
    private String publishDate;
}
