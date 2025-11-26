package kr.ac.korea.budding.repository;

import kr.ac.korea.budding.entity.CheckInEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface CheckInRepository extends JpaRepository<CheckInEntity, Long> {
    CheckInEntity findByUserIdAndDate(Long userId, LocalDate date);

    Boolean existsByUserIdAndDate(Long userId, LocalDate date);
}
