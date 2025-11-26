package kr.ac.korea.budding.mapper;

import kr.ac.korea.budding.dto.CheckInResponseDto;
import kr.ac.korea.budding.entity.CheckInEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CheckInMapper {

    CheckInResponseDto toDto(CheckInEntity checkIn);
}
