package kr.hs.dgsw.userpostcrud.Service;

import kr.hs.dgsw.userpostcrud.Domain.User;

public interface UserService {
    User addUser(User user);    //C
    User loginUser(String userId,User user); //R
    User updateUser(String userId,User user); // U
    boolean removeUser(String userId); //D
}
