package com.fiap.IncluSync.port.out;

import com.fiap.IncluSync.application.domain.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    boolean existsByEmail(String email);
    User findByEmail(String email);
    List<User> getUsers();
}
