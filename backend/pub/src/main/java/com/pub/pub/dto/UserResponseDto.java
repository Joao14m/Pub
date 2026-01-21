package com.pub.pub.dto;

import com.pub.pub.entity.Roles;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// what the server sends back
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class UserResponseDto {
    private Integer userId;
    
    private Roles roleId;
    
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email must be valid")
    private String email;
    
    @NotBlank(message = "Username is mandatory")
    @Size(min=3, max=25)
    private String username;
    
    private String university;
    
    private String userprofilepic;
}
