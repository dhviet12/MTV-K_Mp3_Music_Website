package com.example.demo.service.user;

import com.example.demo.model.user.User;

import java.util.Optional;

public interface IUserService {
    User save(User user);

    User findById(Long id);

    Iterable<User> findAll();

    void remove(Long id);

    boolean existsByUsername(String username);

    boolean existsByEmail (String email);

    User findUserByUserName(String username);

    User getCurrentUser();
//    User findByUsername(String username);

}
