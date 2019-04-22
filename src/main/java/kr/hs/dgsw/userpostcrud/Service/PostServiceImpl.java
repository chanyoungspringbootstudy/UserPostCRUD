package kr.hs.dgsw.userpostcrud.Service;

import kr.hs.dgsw.userpostcrud.Domain.Post;
import kr.hs.dgsw.userpostcrud.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    public PostRepository postRepository;

    @Override
    public List<Post> listPost() {
        return this.postRepository.findAll();
    }

    @Override
    public Post addPost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post loadPost(Long id) {
        return this.postRepository.findById(id).orElse(null);
    }

    @Override
    public Post updatePost(Long id, Post post) {
        Optional<Post> found = this.postRepository.findById(id);
        if (found.isPresent()) {
            Post p = found.get();
            p.setTitle(post.getTitle());
            p.setComment(post.getComment());
            p.setAttachedName(post.getAttachedName());
            p.setAttachedPath(post.getAttachedPath());
            return this.postRepository.save(p);
        } else {
            return null;
        }
    }

    @Override
    public boolean deletePost(Long id) {
        Optional<Post> found = this.postRepository.findById(id);
        if (found.isPresent()) {
            this.postRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
