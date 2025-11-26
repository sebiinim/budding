package kr.ac.korea.budding.repository;

import kr.ac.korea.budding.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    Optional<UserEntity> findByEmailAndPw(String email, String pw);

    Optional<UserEntity> findByEmail(String email);


}
