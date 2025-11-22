package com.fiap.IncluSync.adapter.in.user;

import com.fiap.IncluSync.adapter.in.user.dto.SignupRequestDto;
import com.fiap.IncluSync.adapter.in.user.dto.UserResponseDto;
import com.fiap.IncluSync.port.in.IUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8081")
@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    private final IUser user;


    @PostMapping("/signup")
    public ResponseEntity<UserResponseDto> signup(@RequestBody SignupRequestDto newUser) {
        UserResponseDto userResponseDto = user.create(newUser);
        log.info("User {} created successfully", userResponseDto.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDto);
    }

    @GetMapping("/find")
    public ResponseEntity<UserResponseDto> findUser(@RequestHeader String email){
        UserResponseDto userSearched = user.getUser(email);
        log.info("User {} find successfully", email);

        return ResponseEntity.ok(userSearched);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> findAllUsers(){
        List<UserResponseDto> usersFound = user.findAll();
        log.info("{} users found successfully",  usersFound.size());
        return ResponseEntity.ok(usersFound);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteUser(@RequestHeader String userEmail, @RequestHeader String adminEmail){
        user.deleteUser(userEmail, adminEmail);
        log.info("User {} delete successfully", userEmail);

        return ResponseEntity.noContent().build();
    }
}
