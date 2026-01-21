package com.pub.pub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.pub.pub.dto.CreateUsersRequestDto;
import com.pub.pub.dto.UserResponseDto;
import com.pub.pub.entity.Users;
import com.pub.pub.service.AuthService;
import com.pub.pub.service.UsersService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UsersService userService;

    @PostMapping("/api/signup")
    public ResponseEntity<UserResponseDto> requestMethodName(@RequestBody CreateUsersRequestDto user) {
        UserResponseDto res = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }
    
}
