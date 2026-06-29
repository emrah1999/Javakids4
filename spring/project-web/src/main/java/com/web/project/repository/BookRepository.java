package com.web.project.repository;

import com.web.project.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
