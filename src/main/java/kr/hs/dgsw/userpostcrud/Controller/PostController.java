package kr.hs.dgsw.userpostcrud.Controller;


import kr.hs.dgsw.userpostcrud.Domain.Post;
import kr.hs.dgsw.userpostcrud.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    public PostService postService;

    @GetMapping("/post/list")
    public List<Post> listPost() {
        return this.postService.listPost();
    }

    @PostMapping("/post/add")   //C
    public Post addPost(@RequestBody Post post) {
        return this.postService.addPost(post);
    }

    @GetMapping("/post/load/{id}")  //R
    public Post loadPost(@PathVariable Long id){
        return this.postService.loadPost(id);
    }

    @PostMapping("/post/update/{id}")   //U
    public Post updatePost(@PathVariable Long id, @RequestBody Post post) {
        return this.postService.updatePost(id, post);
    }

    @GetMapping("/post/delete/{id}")    //D
    public boolean deletePost(@PathVariable Long id){
        return this.postService.deletePost(id);
    }

}
