package com.fiap.IncluSync.adapter.out.mapper;

import com.fiap.IncluSync.adapter.in.auth.dto.LoginResponseDto;
import com.fiap.IncluSync.application.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AuthMapper {
    AuthMapper instance = Mappers.getMapper(AuthMapper.class);

    LoginResponseDto toLoginResponseDto(User user);
}
