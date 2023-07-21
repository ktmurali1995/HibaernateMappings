package com.interview.test.controller;

import com.interview.test.model.User;
import com.interview.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllerOneToMany {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{userId}")
    public User getUserDetailes(@PathVariable Long userId)
    {

        return userService.getUserDetailes(userId);
    }
    @GetMapping("/allUsers")
    public List<User> getAllUserDetailes()
    {
        return userService.getAllUserDetailes();
    }
    @PostMapping("/saveUser")
    public User saveUserDetailes(@RequestBody User user)
    {
        return userService.saveUserDetailes(user);
    }
    @PutMapping("/editUser")
    public User editUserDetailes(@RequestBody User user)
    {
        return userService.editUserDetailes(user);
    }
    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUserDetailes(@PathVariable Long userId)
    {
        userService.deleteUserDetailes(userId);
    }
}
