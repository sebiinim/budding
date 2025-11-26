package kr.ac.korea.budding.controller;

import io.swagger.v3.oas.annotations.Operation;
import kr.ac.korea.budding.dto.LoginDto;
import kr.ac.korea.budding.dto.RegisterDto;
import kr.ac.korea.budding.dto.UserResponseDto;
import kr.ac.korea.budding.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    @Operation(summary = "회원가입")
    public UserResponseDto register(@RequestBody RegisterDto dto) {
        return authService.register(dto);
    }

    @PostMapping("/login")
    @Operation(summary = "로그인")
    public UserResponseDto login(@RequestBody LoginDto dto) {
        return authService.login(dto);
    }
}
