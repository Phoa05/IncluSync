package com.fiap.IncluSync.adapter.in.station;

import com.fiap.IncluSync.adapter.in.station.dto.StationRequestDto;
import com.fiap.IncluSync.adapter.in.station.dto.StationResponseDto;
import com.fiap.IncluSync.port.in.IStation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/station")
public class StationController {

    private final IStation stationService;

    @PostMapping("/register")
    public ResponseEntity<StationResponseDto> registerStation(@RequestBody StationRequestDto stationDto){
        StationResponseDto stationResponseDto = stationService.register(stationDto);
        log.info("Station {} register successfully!", stationResponseDto.getId());

        return ResponseEntity.status(HttpStatus.CREATED).body(stationResponseDto);
    }

    @PutMapping("/update")
    public ResponseEntity<StationResponseDto> updateStation(@RequestBody StationRequestDto stationDto){
        StationResponseDto stationResponseDto = stationService.update(stationDto);
        log.info("Station {} update successfully!", stationResponseDto.getName());

        return ResponseEntity.ok(stationResponseDto);
    }

    @GetMapping
    public ResponseEntity<List<StationResponseDto>> getStations(){
        List<StationResponseDto> stations = stationService.getAllStations();
        log.info("{} stations found successfully!", stations.size());

        return ResponseEntity.ok(stations);
    }
}
