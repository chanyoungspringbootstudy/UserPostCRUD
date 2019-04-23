package kr.hs.dgsw.userpostcrud.Controller;


import kr.hs.dgsw.userpostcrud.Domain.Post;
import kr.hs.dgsw.userpostcrud.Protocol.ResponseFormat;
import kr.hs.dgsw.userpostcrud.Protocol.ResponseType;
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
    public ResponseFormat addPost(@RequestBody Post post) {
        return new ResponseFormat(
                ResponseType.POST_ADD,
                this.postService.addPost(post)
        );
    }

    @GetMapping("/post/get/{username}") //R
    public ResponseFormat getPost(@PathVariable String username){
        return new ResponseFormat(
                ResponseType.POST_GET,
                this.postService.getPost(username)
        );
    }

    @PostMapping("/post/update/{id}")   //U
    public ResponseFormat updatePost(@PathVariable Long id, @RequestBody Post post) {
        return new ResponseFormat(
                ResponseType.POST_UPDATE,
                this.postService.updatePost(id,post)
        );
    }

    @GetMapping("/post/delete/{id}")    //D
    public ResponseFormat deletePost(@PathVariable Long id){
        return new ResponseFormat(
                ResponseType.POST_DELETE,
                this.postService.deletePost(id)
        );
    }

}
