package kr.ac.korea.budding.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class UserPointResponseDto {

    private Long userId;

    private Integer points;
}
