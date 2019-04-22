package kr.hs.dgsw.userpostcrud.Repository;

import kr.hs.dgsw.userpostcrud.Domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
