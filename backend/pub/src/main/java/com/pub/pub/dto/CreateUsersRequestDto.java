package com.pub.pub.dto;

import com.pub.pub.entity.Roles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// What the client sends
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CreateUsersRequestDto {
    private Integer userId;
    private Roles roleId;
    private String email;
    private String passwordHash;
    private String username;
    private String university;
    private String userprofilepic;
}
