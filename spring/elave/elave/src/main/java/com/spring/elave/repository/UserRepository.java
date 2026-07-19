package com.spring.elave.repository;

import com.spring.elave.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public void createUser(User user){
        String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getPassword());
    }
    public List<User> getAllUsers(){
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new User(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("password")
        ));
    }
    public void deleteUser(Long id){
        String sql="Delete from users where id=?";
        jdbcTemplate.update(sql,id);
    }
    public List<User> searchForNameAndEmail(String name,String email){

            String sql="SELECT * FROM users WHERE name=? or email=?";
            return jdbcTemplate.query(sql, (rs, rowNum) -> new User(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password")
            ),name,email);
    }

}
