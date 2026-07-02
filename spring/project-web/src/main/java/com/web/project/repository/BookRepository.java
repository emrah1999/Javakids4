package com.web.project.repository;

import com.web.project.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepository {
    private final JdbcTemplate jdbcTemplate;

    public void save(Book s) {
        jdbcTemplate.update(
                "INSERT INTO books(id, title, price) VALUES (?, ?, ?)",
                s.getId(), s.getTitle(), s.getPrice()
        );
    }
    public List<Book> findAll() {
        return jdbcTemplate.query(
                "SELECT * FROM books",
                (rs, rowNum) -> new Book(
                rs.getLong("id"),
                rs.getString("title"),
                rs.getDouble("price")
             )
        );
    }
    public void update(Book book){
        jdbcTemplate.update(
                "UPDATE books SET title = ?, price = ? WHERE id = ?",
                book.getTitle(), book.getPrice(), book.getId()
        );
    }
    public void deleteBook(Long id){
        jdbcTemplate.update(
                "DELETE FROM books WHERE id = ?",
                id
        );
    }

    public Book findById(Long id){
        return jdbcTemplate.queryForObject(
                "SELECT * FROM books WHERE id = ?",
                new Object[]{id},
                (rs, rowNum) -> new Book(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getDouble("price")
                )
        );
    }
}
