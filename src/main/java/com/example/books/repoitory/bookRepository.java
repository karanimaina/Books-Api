package com.example.books.repoitory;

import com.example.books.models.Book;
import org.hibernate.dialect.LobMergeStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class bookRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    //using the jdbc template from the spring jdbc
    public List<Book>findAll(){
        return  jdbcTemplate.query("select * from books", new BeanPropertyRowMapper<Book>(Book.class));
    }

    public Book findById(Long id){
        return jdbcTemplate.queryForObject("select * from book where id =?",new Object[]{id},new BeanPropertyRowMapper<Book>(Book.class));
    }
    public int DeleteById(Long id){
        return jdbcTemplate.update("delete * from book where id =?",new Object[]{id},new BeanPropertyRowMapper<Book>(Book.class));
    }
    public int updateById(Long id){
        return jdbcTemplate.update("select * from book where id =?",new Object[]{id},new BeanPropertyRowMapper<Book>(Book.class));
    }
    public int insert(Book book){
        return jdbcTemplate.update("insert into book(id,name,author)"+"values ("?,?,?")",new Object[]{
                book.getId(),book.getName(),book.getAuthor()
        },new BeanPropertyRowMapper<Book>(Book.class));
    }
//    generate query to update an existing object in the database
    public int update(Book book){
        return jdbcTemplate.update("update book +"+"set name = ?,location =?,birth_date = ?)"+"where id = "?",new Object[]{
                book.getId(),book.getName(),book.getAuthor()
        },new BeanPropertyRowMapper<Book>(Book.class));
    }
}
