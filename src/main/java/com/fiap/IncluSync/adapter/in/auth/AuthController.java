package com.fiap.IncluSync.adapter.in.auth;

import com.fiap.IncluSync.adapter.in.auth.dto.LoginRequestDto;
import com.fiap.IncluSync.adapter.in.auth.dto.LoginResponseDto;
import com.fiap.IncluSync.port.in.IAuth;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:8081")
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/auth")
@RestController
public class AuthController {
    private final IAuth auth;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto requestDto){
        LoginResponseDto responseDto = auth.authenticate(requestDto);
        log.info("User {} logged in successfully", requestDto.getEmail());
        return ResponseEntity.ok(responseDto);
    }
}
