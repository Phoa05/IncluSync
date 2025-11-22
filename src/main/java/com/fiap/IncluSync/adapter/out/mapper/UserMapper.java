package com.fiap.IncluSync.adapter.out.mapper;

import com.fiap.IncluSync.adapter.in.auth.dto.LoginRequestDto;
import com.fiap.IncluSync.adapter.in.user.dto.SignupRequestDto;
import com.fiap.IncluSync.adapter.in.user.dto.UserResponseDto;
import com.fiap.IncluSync.adapter.out.persistence.entity.UserEntity;
import com.fiap.IncluSync.application.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper instance = Mappers.getMapper(UserMapper.class);

    UserEntity toEntity(User user);
    User toDomain(UserEntity entity);
    User toDomain(SignupRequestDto requestDto);
    User toDomain(LoginRequestDto requestDto);
    UserResponseDto toResponseDto(User user);
    List<UserResponseDto> toListResponseDto(List<User> users);
    List<User> toListDomain(List<UserEntity> users);
}
