package com.fiap.IncluSync.application.usecase;

import com.fiap.IncluSync.adapter.in.auth.dto.LoginRequestDto;
import com.fiap.IncluSync.adapter.out.mapper.UserMapper;
import com.fiap.IncluSync.application.domain.User;
import com.fiap.IncluSync.application.exception.UnauthorizedException;
import com.fiap.IncluSync.port.in.IAuth;
import com.fiap.IncluSync.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthUseCase implements IAuth {

    private final UserRepository userRepository;

    @Override
    public void authenticate(LoginRequestDto user) {
        User domain = UserMapper.instance.toDomain(user);

        User authenticatedUser = userRepository.findByEmail(domain.getEmail());

        if(!authenticatedUser.getPassword().equals(user.getPassword())) {
            throw new UnauthorizedException("User" + user.getEmail() + " unauthorized");
        }
    }

}