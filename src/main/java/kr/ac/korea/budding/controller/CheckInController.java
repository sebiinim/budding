package kr.ac.korea.budding.controller;

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
    public CheckInResponseDto checkIn(
            @PathVariable Integer user_id
    ) {
        return checkInService.checkIn(user_id);
    }

    @GetMapping("{user_id}")
    public Boolean IsCheckIn(
            @PathVariable Integer user_id
    ) {
        return checkInService.IscheckIn(user_id);
    }
}
