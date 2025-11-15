package com.fiap.IncluSync.port.out;

import com.fiap.IncluSync.application.domain.User;

public interface UserRepository {
    User save(User user);
    boolean existsByEmail(String email);
    User findByEmail(String email);
}
