package com.fiap.IncluSync.application.usecase;

import com.fiap.IncluSync.adapter.in.user.dto.SignupRequestDto;
import com.fiap.IncluSync.adapter.in.user.dto.UserResponseDto;
import com.fiap.IncluSync.adapter.out.mapper.UserMapper;
import com.fiap.IncluSync.application.domain.User;
import com.fiap.IncluSync.application.exception.UnauthorizedException;
import com.fiap.IncluSync.application.exception.UserExistsException;
import com.fiap.IncluSync.port.in.IUser;
import com.fiap.IncluSync.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserUseCase implements IUser {

    private final UserRepository userRepository;

    @Override
    public UserResponseDto create(SignupRequestDto newUser) {
        User domain = UserMapper.instance.toDomain(newUser);

        if (userRepository.existsByEmail(domain.getEmail())) {
            throw new UserExistsException("User already exists!");
        }

        return UserMapper.instance.toResponseDto(userRepository.save(domain));
    }

    @Override
    public UserResponseDto getUser(String email) {
        return UserMapper.instance.toResponseDto(userRepository.findByEmail(email));
    }

    @Override
    public List<UserResponseDto> findAll() {
        return UserMapper.instance.toListResponseDto(userRepository.getUsers());
    }

    @Override
    public void deleteUser(String emailUser, String emailAdmin) {
        User admin = userRepository.findByEmail(emailAdmin);
        User user = userRepository.findByEmail(emailUser);

        if(!admin.getAccess().equals("admin") || (user.getAccess().equals("admin") && !user.getId().equals(admin.getId()))) {
            throw new UnauthorizedException("User does not have privileges to perform this operation");
        }

        userRepository.deleteUser(user.getId());
    }
}
