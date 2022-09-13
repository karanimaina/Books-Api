package com.example.books.controller;

import com.example.books.models.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class  BooksController{
@GetMapping("/books")
    public List<Books>getAllBooks(){
    return Arrays.asList(
            new Books(1L,"hero","felix"),
            new Books(2L,"negro","drake"),
            new Books(3L,"creation","Genevieve"),
            new Books(4L,"maurice","maina")
    );
}
}
