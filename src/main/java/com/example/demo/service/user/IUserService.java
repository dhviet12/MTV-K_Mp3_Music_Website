package com.example.demo.service.user;

import com.example.demo.model.user.User;

import java.util.Optional;

public interface IUserService {
    void save(User user);

    Optional<User> findById(Long id);

    Iterable<User> findAll();

    void remove(Long id);

    boolean existsByUsername(String username);

    User findUserByUserName(String username);
}
