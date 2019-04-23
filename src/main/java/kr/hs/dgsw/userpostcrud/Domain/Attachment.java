package kr.hs.dgsw.userpostcrud.Domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Attachment {
    private Long postIndex;
    private String userId;
    private String attachedPath;

    public Attachment(Long postIndex, String userId, String attachedPath) {
        this.postIndex = postIndex;
        this.userId = userId;
        this.attachedPath = attachedPath;
    }
}
