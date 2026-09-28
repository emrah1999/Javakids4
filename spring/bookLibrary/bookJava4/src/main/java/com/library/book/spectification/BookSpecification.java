package com.library.book.spectification;

import com.library.book.entity.BookEntity;
import com.library.book.request.BookFilterRequestDTO;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class BookSpecification {
    public static Specification<BookEntity> filter(BookFilterRequestDTO req){
        return (root, query, cb) -> {

            List<Predicate> predicates = new ArrayList<>();


            if (req.getName() != null && !req.getName().isEmpty()) {
                predicates.add(
                        cb.like(cb.lower(root.get("name")),"%" + req.getName().toLowerCase() + "%"
                        )
                );
                //where name like '%kitabin adi%'
            }
            //where title like %boks%
            if (req.getAuthor() != null && !req.getAuthor().isEmpty()) {
                predicates.add(
                        cb.like(
                                cb.lower(root.get("author")),
                                "%" + req.getAuthor().toLowerCase() + "%"
                        )
                );
            }


            return cb.and(predicates.toArray(new Predicate[0]));
            // where name like '%kiitabin adi%' and author like '%muellif%'
        };
    }
}
