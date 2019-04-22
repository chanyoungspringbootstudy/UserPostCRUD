package kr.hs.dgsw.userpostcrud.Service;

import kr.hs.dgsw.userpostcrud.Domain.User;
import kr.hs.dgsw.userpostcrud.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    void init(){
        this.userRepository.save(new User("2001_hcy","1234","허찬영","2001_hcy@naver.com","images\\default\\default.jpg","default.jpg"));
        this.userRepository.save(new User("gjcksdud01","1234","허찬영","hcyoung01@naver.com","images\\default\\default.jpg","default.jpg"));
    }

    @Override
    public User addUser(User user) {
        Optional<User> found = this.userRepository.findById(user.getId());
        if (found.isPresent()) {
            return null;
        } else {
            return this.userRepository.save(user);
        }
    }

    @Override
    public User loginUser(String userId,User user) {
//        Optional<User> found = this.userRepository.findById(userId);
        Optional<User> found = this.userRepository.findById(user.getId());
        if (found.isPresent()) {
            User temp = found.get();
            if (temp.getPassword().equals( user.getPassword())) {
                return temp;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public User updateUser(String userId, User user) {
        Optional<User> found = this.userRepository.findById(userId);
        if (found.isPresent()) {
            User temp = found.get();
            temp.setPassword(user.getPassword());
            temp.setUsername(user.getUsername());
            temp.setEmail(user.getEmail());
            temp.setProfileImageName(user.getProfileImageName());
            temp.setProfileImagePath(user.getProfileImagePath());
            return this.userRepository.save(temp);
        } else {
            return null;
        }
    }

    @Override
    public boolean removeUser(String userId) {
        Optional<User> found = this.userRepository.findById(userId);
        if (found.isPresent()) {
            this.userRepository.deleteById(userId);
            return true;
        } else {
            return false;
        }
    }
}