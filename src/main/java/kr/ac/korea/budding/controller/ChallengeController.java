package kr.ac.korea.budding.controller;

import io.swagger.v3.oas.annotations.Operation;
import kr.ac.korea.budding.dto.ChallengeRequestDto;
import kr.ac.korea.budding.dto.ChallengeResponseDto;
import kr.ac.korea.budding.enums.ParticipationStatus;
import kr.ac.korea.budding.service.ChallengeService;
import lombok.RequiredArgsConstructor;
import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/challenges")
public class ChallengeController {

    private final ChallengeService challengeService;

    @PostMapping("/{userId}")
    @Operation(summary = "챌린지 생성하기")
    public ChallengeResponseDto createChallenge(
            @PathVariable Long userId,
            @RequestBody ChallengeRequestDto challengeRequestDto
    ) {
        return challengeService.createChallenge(challengeRequestDto, userId);
    }

    @GetMapping("/{userId}")
    @Operation(summary = "내가 진행 중인 챌린지들 확인하기")
    public List<ChallengeResponseDto> getMyChallenges(
            @PathVariable Long userId,
            @RequestParam ParticipationStatus status
    ) {

        return challengeService.getMyChallenges(userId, status);
    }
}
