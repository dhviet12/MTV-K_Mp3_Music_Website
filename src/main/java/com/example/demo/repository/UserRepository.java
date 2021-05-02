package com.example.demo.repository;

import com.example.demo.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findUserById(Long id);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);



}
