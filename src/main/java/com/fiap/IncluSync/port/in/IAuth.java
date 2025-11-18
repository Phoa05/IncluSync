package com.fiap.IncluSync.port.in;

import com.fiap.IncluSync.adapter.in.auth.dto.LoginRequestDto;

public interface IAuth {
    void authenticate(LoginRequestDto newUser);
}
