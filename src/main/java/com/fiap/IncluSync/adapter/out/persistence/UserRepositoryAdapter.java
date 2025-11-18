package com.fiap.IncluSync.adapter.out.persistence;

import com.fiap.IncluSync.adapter.out.mapper.UserMapper;
import com.fiap.IncluSync.adapter.out.persistence.entity.UserEntity;
import com.fiap.IncluSync.adapter.out.persistence.infrastructure.UserJpaRepository;
import com.fiap.IncluSync.application.domain.User;
import com.fiap.IncluSync.application.exception.UserNotFoundException;
import com.fiap.IncluSync.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserRepositoryAdapter implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public User save(User user) {
        UserEntity newEntity = userJpaRepository.save(UserMapper.instance.toEntity(user));
        log.info("User saved with id {}", newEntity.getId());

        return UserMapper.instance.toDomain(newEntity);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userJpaRepository.existsByEmail(email);
    }

    @Override
    public User findByEmail(String email) {
        UserEntity entity = userJpaRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("User " + email + " not found"));
        log.info("User found with email {}", entity.getEmail());

        return UserMapper.instance.toDomain(entity);
    }

    @Override
    public List<User> getUsers() {
        List<UserEntity> users = userJpaRepository.findAll();
        return UserMapper.instance.toListDomain(users);
    }

    @Override
    public void deleteUser(Long userId) {
        userJpaRepository.deleteById(userId);
    }

}
