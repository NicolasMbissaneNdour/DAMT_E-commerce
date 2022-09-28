package com.nicolas.back.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public List<User> index(){
        return userService.findAllUsers();
    }

    @GetMapping(value = "/{id}")
    public String show(@PathVariable Long id){
        return "show "+id;
    }
    
    @PutMapping(value = "/{id}")
    public String update(@PathVariable Long id){
        return "update "+id;
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Long id){
        return "delete "+id;
    }
    
    @PostMapping(value = "/login")
    public String login(@RequestBody User user){
        if (!userService.isValidUserLoginRequestBody(user)) {
            return "Invalid user body";
        }
        

        if (!userService.isCorrectUser(user)) {
            return "Email ou mot de passe incorrect";
        }
        
        return "login";
    }

    @PostMapping(value = "/register")
    public String register(@RequestBody User user) {
        if (!userService.isValidUserRegisterRequestBody(user)) {
            return "Invalid user register body";
        }

        if(userService.findUserByEmail(user.getEmail()) != null) {
            return "Adresse mail existe deja";
        }

        user.setAdmin(false);
        userService.saveUser(user);

        return "register";
    }
}
