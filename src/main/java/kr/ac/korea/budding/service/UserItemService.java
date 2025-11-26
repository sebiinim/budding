package kr.ac.korea.budding.service;

import jakarta.transaction.Transactional;
import kr.ac.korea.budding.dto.UserItemAllResponseDto;
import kr.ac.korea.budding.repository.UserItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserItemService {

    private final UserItemRepository userItemRepository;

}
