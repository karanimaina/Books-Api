package com.example.books.repoitory;

import com.example.books.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class bookRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    //using the jdbc template from the sspting jdbc
    public List<Book>findAll(){
        return  jdbcTemplate.query("select * from books", new BeanPropertyRowMapper<Book>(Book.class));
    }
}
