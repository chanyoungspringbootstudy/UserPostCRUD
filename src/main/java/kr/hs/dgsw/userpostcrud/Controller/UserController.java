package kr.hs.dgsw.userpostcrud.Controller;

import kr.hs.dgsw.userpostcrud.Domain.User;
import kr.hs.dgsw.userpostcrud.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/user/add")   //C
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }

    @PostMapping("/user/login/{userId}")    //R
    public User loginUser(@PathVariable String userId, @RequestBody User user) {
        return this.userService.loginUser(userId, user);
    }

    @PostMapping("/user/login/{userId}")    //U
    public User updateUser(@PathVariable String userId, @RequestBody User user) {
        return this.userService.updateUser(userId, user);
    }

    @GetMapping("/user/remove/{userId}")    //D
    public boolean removeUser(@PathVariable String userId){
        return this.userService.removeUser(userId);
    }

}
