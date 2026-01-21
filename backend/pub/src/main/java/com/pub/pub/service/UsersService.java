package com.pub.pub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.pub.pub.dto.CreateUsersRequestDto;
import com.pub.pub.dto.UserResponseDto;
import com.pub.pub.entity.Users;
import com.pub.pub.repository.UsersRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;
    private PasswordEncoder passwordEncoder;

    public UserResponseDto createUser(CreateUsersRequestDto usersDto){
        Users userEntity = Users.builder()
            .email(usersDto.getEmail())
            .passwordHash(
                usersDto.getPasswordHash() == null || usersDto.getPasswordHash().isBlank()
                    ? null 
                    : passwordEncoder.encode(usersDto.getPasswordHash())
            )
            .username(usersDto.getUsername())
            .university(usersDto.getUniversity())
            .userprofilepic(usersDto.getUserprofilepic())
            .build();
        
        usersRepository.save(userEntity);

        return UserResponseDto.builder()
            .userId(userEntity.getUserId())
            .roleId(userEntity.getRoleId())
            .email(userEntity.getEmail())
            .username(userEntity.getUsername())
            .university(userEntity.getUniversity())
            .userprofilepic(userEntity.getUserprofilepic())
            .build();
    }
}
