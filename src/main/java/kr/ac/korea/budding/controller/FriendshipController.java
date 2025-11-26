package kr.ac.korea.budding.controller;

import io.swagger.v3.oas.annotations.Operation;
import kr.ac.korea.budding.dto.FriendshipResponseDto;
import kr.ac.korea.budding.dto.UserResponseDto;
import kr.ac.korea.budding.repository.FriendshipRepository;
import kr.ac.korea.budding.service.FriendshipService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/friendships")
public class FriendshipController {

    private final FriendshipService friendshipService;

    @PostMapping("")
    @Operation(summary = "친구 추가하기(자동 수락)")
    public FriendshipResponseDto createFriendship(
            @RequestParam Long user1_id,
            @RequestParam Long user2_id
    ){
        return friendshipService.createFriendship(user1_id, user2_id);
    }

    @GetMapping("/{userId}")
    @Operation(summary = "내 친구들 찾기")
    public List<UserResponseDto> findMyFriends(
            @PathVariable Long userId
    ) {
        return friendshipService.findMyFriends(userId);
    }
}
