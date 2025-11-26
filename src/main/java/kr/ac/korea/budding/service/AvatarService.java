package kr.ac.korea.budding.service;

import jakarta.transaction.Transactional;
import kr.ac.korea.budding.dto.AvatarRequestDto;
import kr.ac.korea.budding.dto.AvatarResponseDto;
import kr.ac.korea.budding.entity.AvatarEntity;
import kr.ac.korea.budding.entity.UserEntity;
import kr.ac.korea.budding.mapper.AvatarMapper;
import kr.ac.korea.budding.repository.AvatarRepository;
import kr.ac.korea.budding.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvatarService {

    private final AvatarRepository avatarRepository;
    private final UserRepository userRepository;

    private final AvatarMapper avatarMapper;

    // 아바타 설정
    // Todo: 구매한 아이템으로만 할 수 있게
    @Transactional
    public AvatarResponseDto setAvatar(Long userId, AvatarRequestDto req) {

        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(String.format("user with id: %d not found", userId)));

        AvatarEntity avatar = user.getAvatar();

        avatar.setHat(req.getHat());
        avatar.setEyewear(req.getEyewear());
        avatar.setTop(req.getTop());
        avatar.setBottom(req.getBottom());
        avatar.setShoes(req.getShoes());

        avatarRepository.save(avatar);

        return avatarMapper.toDto(avatar);
    }

    // userId로 avatar 얻기
    // todo: userItemEntity 사용하도록 변경하기
    @Transactional
    public AvatarResponseDto getAvatarByUserId(Long userId) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(String.format("user with id: %d not found", userId)));

        AvatarEntity avatar = user.getAvatar();

        return avatarMapper.toDto(avatar);
    }


}
