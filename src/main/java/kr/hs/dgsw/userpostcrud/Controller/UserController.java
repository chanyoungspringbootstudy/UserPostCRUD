package kr.hs.dgsw.userpostcrud.Controller;

import kr.hs.dgsw.userpostcrud.Domain.User;
import kr.hs.dgsw.userpostcrud.Protocol.ResponseFormat;
import kr.hs.dgsw.userpostcrud.Protocol.ResponseType;
import kr.hs.dgsw.userpostcrud.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/user/add")   //C
    public ResponseFormat addUser(@RequestBody User user) {
        return new ResponseFormat(
                ResponseType.POST_ADD,
                this.userService.addUser(user)
        );
    }

    @PostMapping("/user/login/{userId}")    //R
    public ResponseFormat loginUser(@PathVariable String userId, @RequestBody User user) {
        return new ResponseFormat(
                ResponseType.POST_ADD,
                this.userService.loginUser(userId,user)
        );
    }

    @PostMapping("/user/login/{userId}")    //U
    public ResponseFormat updateUser(@PathVariable String userId, @RequestBody User user) {
        return new ResponseFormat(
                ResponseType.POST_ADD,
                this.userService.updateUser(userId,user)
        );
    }

    @GetMapping("/user/remove/{userId}")    //D
    public ResponseFormat removeUser(@PathVariable String userId){
        return new ResponseFormat(
                ResponseType.POST_ADD,
                this.userService.removeUser(userId)
        );
    }

}
