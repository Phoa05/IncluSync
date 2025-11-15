package com.fiap.IncluSync.adapter.out.mapper;

import com.fiap.IncluSync.adapter.in.dto.LoginRequestDto;
import com.fiap.IncluSync.adapter.in.dto.SignupRequestDto;
import com.fiap.IncluSync.adapter.in.dto.UserResponseDto;
import com.fiap.IncluSync.adapter.out.persistence.entity.UserEntity;
import com.fiap.IncluSync.application.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthMapper {
    AuthMapper instance = Mappers.getMapper(AuthMapper.class);

    UserEntity toEntity(User user);
    User toDomain(UserEntity entity);
    User toDomain(SignupRequestDto requestDto);
    User toDomain(LoginRequestDto requestDto);
    UserResponseDto toResponseDto(User user);
}
