package kr.ac.korea.budding.controller;

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
    public ChallengeResponseDto createChallenge(
            @PathVariable Integer userId,
            @RequestBody ChallengeRequestDto challengeRequestDto
    ) {
        return challengeService.createChallenge(challengeRequestDto, userId);
    }

    @GetMapping("/{userId}")
    public List<ChallengeResponseDto> getMyChallenges(
            @PathVariable Integer userId,
            @RequestParam ParticipationStatus status
    ) {

        return challengeService.getMyChallenges(userId, status);
    }
}
