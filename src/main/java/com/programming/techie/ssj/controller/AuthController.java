package com.programming.techie.ssj.controller;

import com.programming.techie.ssj.dto.LoginRequest;
import com.programming.techie.ssj.dto.LoginResponse;
import com.programming.techie.ssj.dto.RegisterRequest;
import com.programming.techie.ssj.dto.RegisterResponse;
import com.programming.techie.ssj.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest registerRequest) {
        authenticationService.register(registerRequest);
        return new RegisterResponse("User registered successfully");
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return authenticationService.login(loginRequest);
    }
}
