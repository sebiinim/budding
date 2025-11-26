package kr.ac.korea.budding.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.websocket.server.PathParam;
import kr.ac.korea.budding.dto.ItemRequestDto;
import kr.ac.korea.budding.dto.ItemResponseDto;
import kr.ac.korea.budding.enums.ItemSlots;
import kr.ac.korea.budding.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    @PostMapping("")
    @Operation(summary = "아이템 생성하기(관리자용)")
    public ItemResponseDto createItem(
            @RequestBody ItemRequestDto itemRequestDto
    ) {
        return itemService.createItem(itemRequestDto);
    }

    @PatchMapping("/{itemId}")
    @Operation(summary = "아이템 변경하기(관리자용)")
    public ItemResponseDto updateItem(
            @RequestBody ItemRequestDto itemRequestDto,
            @PathVariable Long itemId
    ) {
        return itemService.updateItem(itemRequestDto, itemId);
    }

    @GetMapping("")
    @Operation(summary = "slot별로 모든 아이템 조회하기(관리자용)")
    public List<ItemResponseDto> getItem(
        @RequestParam ItemSlots slot
    ) {
        return itemService.findItemsBySlot(slot);
    }

    @PostMapping("/buy")
    @Operation(summary = "아이템 구매하기")
    public ItemResponseDto buyItem(
            @RequestParam Long userId,
            @RequestParam Long itemId
    ) {
        return itemService.buyItem(itemId, userId);
    }

    @GetMapping("/user/{userId}/items")
    @Operation(summary = "내가 보유 중인 아이템 보기")
    public List<ItemResponseDto> getUserItems(
            @PathVariable Long userId
    ) {
        return itemService.getUserItems(userId);
    }

}
