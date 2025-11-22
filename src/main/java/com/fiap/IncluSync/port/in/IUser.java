package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.user.dto.SignupRequestDto;
import com.fiap.IncluSync.adapter.in.user.dto.UserResponseDto;

import java.util.List;

public interface IUser {
    UserResponseDto create(SignupRequestDto user);
    UserResponseDto getUser(String email);
    List<UserResponseDto> findAll();
    void deleteUser(String emailUser, String emailAdmin);
}
