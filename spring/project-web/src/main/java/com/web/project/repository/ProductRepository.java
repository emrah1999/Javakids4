package com.web.project.repository;

import com.web.project.model.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<Products> findAll(){
        String sql="select * from products";
        return jdbcTemplate.query(sql,(rs, rowNum) -> new Products(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getDouble("price"),
                rs.getString("barcode")
        ));
    }
    public void save(Products product){
            String sql="insert into products(name,price,barcode) values(?,?,?)";
            jdbcTemplate.update(sql,product.getName(),product.getPrice(),product.getBarcode());
    }

    public Products findById(Long id){
        String sql="select * from products where id=?";

        List<Products> list = jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(Products.class),
                id
        );

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }
}
