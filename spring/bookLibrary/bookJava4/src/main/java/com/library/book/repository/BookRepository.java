package com.library.book.repository;

import com.library.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookRepository extends JpaRepository<BookEntity,Long>,JpaSpecificationExecutor<BookEntity> {
}
