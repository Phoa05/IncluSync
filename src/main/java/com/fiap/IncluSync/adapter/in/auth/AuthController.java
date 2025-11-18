package com.fiap.IncluSync.adapter.in.auth;

import com.fiap.IncluSync.adapter.in.auth.dto.LoginRequestDto;
import com.fiap.IncluSync.port.in.IAuth;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RequestMapping("/auth")
@RestController
public class AuthController {
    private final IAuth auth;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDto requestDto){
        auth.authenticate(requestDto);
        log.info("User {} logged in successfully", requestDto.getEmail());
        return ResponseEntity.ok().build();
    }
}
