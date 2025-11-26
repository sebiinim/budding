package kr.ac.korea.budding.controller;

import io.swagger.v3.oas.annotations.Operation;
import kr.ac.korea.budding.dto.CheckInResponseDto;
import kr.ac.korea.budding.entity.CheckInEntity;
import kr.ac.korea.budding.service.CheckInService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/checkIns")
public class CheckInController {

    private final CheckInService checkInService;

    @PostMapping("{user_id}")
    @Operation(summary = "출석체크하기")
    public CheckInResponseDto checkIn(
            @PathVariable Long user_id
    ) {
        return checkInService.checkIn(user_id);
    }

    @GetMapping("{user_id}")
    @Operation(summary = "오늘 출석체크 했는지 확인하기")
    public Boolean IsCheckIn(
            @PathVariable Long user_id
    ) {
        return checkInService.IscheckIn(user_id);
    }
}
