package com.nicolas.back.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserReposirory userReposirory;

    public User findUserByEmail(String email) {
        var user = userReposirory.findByEmail(email);
        if (user.isEmpty()) {
            return null;
        }

        return user.get();
        
    }

    public User findUser(Long id) {
        var user = userReposirory.findById(id);
        if (user.isEmpty()) {
            return null;
        }

        return user.get();
    }

    public User saveUser(User user) {
        User result = userReposirory.save(user);
        return result;
    }

    public List<User> findAllUsers() {
        return userReposirory.findAll();
    }

    public boolean isValidUserLoginRequestBody(User user) {
        return user.getEmail() != null && user.getPassword() != null;
    }

    public boolean isValidUserRegisterRequestBody(User user) {
        return user.getEmail() != null && user.getPassword() != null && user.getAdresse() != null &&
                user.getNom() != null && user.getPrenom() != null && user.getTelephone() != null;
    }

    public boolean isCorrectUser(User user) {
        User correctUser = this.findUserByEmail(user.getEmail());
        if (correctUser == null) {
            return false;
        }

        return correctUser.getPassword().equals(user.getPassword());
    }


}
