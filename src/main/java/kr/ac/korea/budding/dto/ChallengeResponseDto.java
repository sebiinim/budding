package kr.ac.korea.budding.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class ChallengeResponseDto {
    private Integer id;
    private String name;
    private String category;
    private Date startDate;
    private Date endDate;
    private Integer targetCount;
    private Integer currentCertCount;
}
