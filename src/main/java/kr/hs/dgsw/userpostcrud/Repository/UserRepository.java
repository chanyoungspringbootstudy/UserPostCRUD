package kr.hs.dgsw.userpostcrud.Repository;

import kr.hs.dgsw.userpostcrud.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}