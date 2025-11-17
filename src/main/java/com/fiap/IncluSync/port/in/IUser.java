package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.dto.UserResponseDto;

import java.util.List;

public interface IUser {
    UserResponseDto getUser(String email);
    List<UserResponseDto> findAll();
}
