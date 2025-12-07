package kr.ac.korea.budding.service;

import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import kr.ac.korea.budding.dto.UserPointResponseDto;
import kr.ac.korea.budding.entity.UserEntity;
import kr.ac.korea.budding.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PointService {

    private final UserRepository userRepository;

    // 내 포인트 조회
    public UserPointResponseDto getUserPoint(Long userId) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(
                () -> new RuntimeException(String.format("User with id %d not found", userId))
        );

        return UserPointResponseDto.builder()
                .point(userEntity.getPoint())
                .build();
    }
}
