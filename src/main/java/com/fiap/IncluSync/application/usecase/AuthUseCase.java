package com.fiap.IncluSync.application.usecase;

import com.fiap.IncluSync.adapter.in.auth.dto.LoginRequestDto;
import com.fiap.IncluSync.adapter.in.auth.dto.LoginResponseDto;
import com.fiap.IncluSync.adapter.out.mapper.AuthMapper;
import com.fiap.IncluSync.adapter.out.mapper.UserMapper;
import com.fiap.IncluSync.application.domain.User;
import com.fiap.IncluSync.application.exception.UnauthorizedException;
import com.fiap.IncluSync.port.in.IAuth;
import com.fiap.IncluSync.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthUseCase implements IAuth {

    private final UserRepository userRepository;

    @Override
    public LoginResponseDto authenticate(LoginRequestDto user) {
        User domain = UserMapper.instance.toDomain(user);

        User authenticatedUser = userRepository.findByEmail(domain.getEmail());

        if(!authenticatedUser.getPassword().equals(user.getPassword())) {
            throw new UnauthorizedException("User" + user.getEmail() + " unauthorized");
        }

        LoginResponseDto loginResponseDto = AuthMapper.instance.toLoginResponseDto(authenticatedUser);
        loginResponseDto.setCode(200);

        return loginResponseDto;
    }

}