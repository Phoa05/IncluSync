package com.fiap.IncluSync.adapter.in;

import com.fiap.IncluSync.adapter.in.dto.UserResponseDto;
import com.fiap.IncluSync.port.in.IUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    private final IUser user;

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

}
