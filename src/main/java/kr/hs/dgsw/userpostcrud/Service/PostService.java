package kr.hs.dgsw.userpostcrud.Service;

import kr.hs.dgsw.userpostcrud.Domain.Post;

import java.util.List;

public interface PostService {
    List<Post> listPost();
    Post getPost(String username);
    Post addPost(Post post);
    Post loadPost(Long id);
    Post updatePost(Long id, Post post);
    boolean deletePost(Long id);
}
