package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.auth.dto.LoginRequestDto;
import com.fiap.IncluSync.adapter.in.auth.dto.LoginResponseDto;

public interface IAuth {
    LoginResponseDto authenticate(LoginRequestDto newUser);
}
