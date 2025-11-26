package kr.ac.korea.budding.controller;

import io.swagger.v3.oas.annotations.Operation;
import kr.ac.korea.budding.dto.UserPointResponseDto;
import kr.ac.korea.budding.service.PointService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/points")
public class PointController {

    private final PointService pointService;

    @GetMapping("/{userId}")
    @Operation(summary = "유저의 포인트 확인하기")
    public UserPointResponseDto getUserPoint(
            @PathVariable Long userId
    ) {
        return  pointService.getUserPoint(userId);
    }
}
