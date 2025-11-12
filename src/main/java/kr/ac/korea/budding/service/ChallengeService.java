package kr.ac.korea.budding.service;

import jakarta.transaction.Transactional;
import kr.ac.korea.budding.dto.ChallengeRequestDto;
import kr.ac.korea.budding.dto.ChallengeResponseDto;
import kr.ac.korea.budding.entity.ChallengeEntity;
import kr.ac.korea.budding.repository.ChallengeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChallengeService {

    private final ChallengeRepository challengeRepository;

    @Transactional
    public ChallengeResponseDto createSchedule(ChallengeRequestDto req) {
        ChallengeEntity entity = ChallengeEntity.builder()
                .name(req.getName())
                .category(req.getCategory())
                .startDate(req.getStartDate())
                .endDate(req.getEndDate())
                .targetCount(req.getTargetCount())
                .currentCertCount(req.getCurrentCertCount())
                .build();

        challengeRepository.save(entity);
        return ChallengeResponseDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .startDate(entity.getStartDate())
                .endDate(entity.getEndDate())
                .targetCount(entity.getTargetCount())
                .currentCertCount(entity.getCurrentCertCount())
                .build();

    }
}
