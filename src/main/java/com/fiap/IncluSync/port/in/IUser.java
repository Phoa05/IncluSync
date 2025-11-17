package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.dto.UserResponseDto;

public interface IUser {
    UserResponseDto getUser(String email);
}
