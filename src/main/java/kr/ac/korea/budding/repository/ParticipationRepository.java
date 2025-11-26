package kr.ac.korea.budding.repository;

import kr.ac.korea.budding.entity.ChallengeEntity;
import kr.ac.korea.budding.entity.ParticipationEntity;
import kr.ac.korea.budding.enums.ParticipationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipationRepository extends JpaRepository<ParticipationEntity, Integer> {
    List<ParticipationEntity> findByUserId(Integer userId);

    List<ParticipationEntity> findByUserIdAndStatus(Integer userId, ParticipationStatus status);
}
