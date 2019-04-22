package kr.hs.dgsw.userpostcrud.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String password;

    private String username;    // 이름
    private String email;       // 이메일
    private String profileImagePath;    //프사 저장경로
    private String profileImageName;    //프사 이름

    @CreationTimestamp
    private LocalDateTime joined;   //가입일자
    @UpdateTimestamp
    private LocalDateTime modified; //수정일자


    public User(String id, String password, String username, String email, String profileImagePath, String profileImageName) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.email = email;
        this.profileImagePath = profileImagePath;
        this.profileImageName = profileImageName;
    }

    public User(String id, String password, String username, String email) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.email = email;
    }

    public User(String id, String password) { // 로그인용
        this.id = id;
        this.password = password;
    }
}
