package kr.ac.korea.budding.repository;

import kr.ac.korea.budding.entity.FriendshipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendshipRepository extends JpaRepository<FriendshipEntity, Long> {
    List<FriendshipEntity> findByUser1IdOrUser2Id(Long user1Id, Long user2Id);

    FriendshipEntity findByUser1IdAndUser2Id(Long user1Id, Long user2Id);
}
