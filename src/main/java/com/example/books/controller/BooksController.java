package com.example.books.controller;

import com.example.books.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class  BooksController{
@GetMapping("/books")
    public List<Book>getAllBooks(){
    return Arrays.asList(
            new Book(1L,"hero","felix"),
            new Book(2L,"negro","drake"),
            new Book(3L,"creation","Genevieve"),
            new Book(4L,"maurice","maina")
    );
}
}
