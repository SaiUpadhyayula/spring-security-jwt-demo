package com.programming.techie.ssj.entity;

import com.programming.techie.ssj.dto.RegisterRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String email;
    private String username;
    private String password;
    private String role;

    public static User fromRegisterRequest(RegisterRequest registerRequest) {
        return User.builder()
                .email(registerRequest.email())
                .username(registerRequest.username())
                .password(registerRequest.password())
                .role("ROLE_USER")
                .build();
    }
}
