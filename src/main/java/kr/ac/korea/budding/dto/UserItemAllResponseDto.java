package kr.ac.korea.budding.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserItemAllResponseDto {

    private Long userId;

    private List<ItemResponseDto> items;
}
