package com.library.book.repository;

import com.library.book.entity.BookEntity;
import com.library.book.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface BookRepository extends JpaRepository<BookEntity,Long>,JpaSpecificationExecutor<BookEntity> {
    Optional<BookEntity> findByBarcode(String barcode);
}
