package kr.hs.dgsw.userpostcrud.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postIndex;

    private String title;
    private String comment;
    private String attachedPath;
    private String attachedName;

    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;

    public Post(String title, String comment, String attachedPath, String attachedName) {
        this.title = title;
        this.comment = comment;
        this.attachedPath = attachedPath;
        this.attachedName = attachedName;
    }

    public Post(String title, String content) {
        this.title = title;
        this.comment = content;
    }
}
