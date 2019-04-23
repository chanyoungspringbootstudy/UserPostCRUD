package kr.hs.dgsw.userpostcrud.Repository;

import kr.hs.dgsw.userpostcrud.Domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {
    Optional<Post> findTopByUsernameOrderByPostIndexDesc(String username);
}
