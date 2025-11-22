package com.fiap.IncluSync.adapter.in.direction;

import com.fiap.IncluSync.adapter.in.direction.dto.DirectionRequestDto;
import com.fiap.IncluSync.adapter.in.direction.dto.DirectionResponseDto;
import com.fiap.IncluSync.port.in.IDirection;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("http://localhost:8081")
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/direction")
@RestController
public class DirectionController {

    private final IDirection direction;

    @PostMapping
    public ResponseEntity<DirectionResponseDto> recommendDirection(@RequestBody DirectionRequestDto requestDto){
        DirectionResponseDto directionResponseDto = direction.getDirection(requestDto);
        log.info("Direction recommendation generated successfully");

        return ResponseEntity.ok(directionResponseDto);
    }
}
