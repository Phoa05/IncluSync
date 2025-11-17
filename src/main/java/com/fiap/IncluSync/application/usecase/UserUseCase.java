package com.fiap.IncluSync.application.usecase;

import com.fiap.IncluSync.adapter.in.dto.UserResponseDto;
import com.fiap.IncluSync.adapter.out.mapper.UserMapper;
import com.fiap.IncluSync.port.in.IUser;
import com.fiap.IncluSync.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserUseCase implements IUser {

    private final UserRepository userRepository;

    @Override
    public UserResponseDto getUser(String email) {
        return UserMapper.instance.toResponseDto(userRepository.findByEmail(email));
    }
}
