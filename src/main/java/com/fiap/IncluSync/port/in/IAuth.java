package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.dto.LoginRequestDto;
import com.fiap.IncluSync.adapter.in.dto.SignupRequestDto;
import com.fiap.IncluSync.adapter.in.dto.UserResponseDto;

public interface IAuth {
    UserResponseDto create(SignupRequestDto user);
    void authenticate(LoginRequestDto user);
}
