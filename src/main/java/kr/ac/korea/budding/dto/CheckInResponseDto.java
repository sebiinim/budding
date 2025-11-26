package kr.ac.korea.budding.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CheckInResponseDto {

    private Long id;

    private Integer user_id;

    private LocalDate date;

    private Boolean status;
}
