package com.interview.test.service;

import com.interview.test.model.User;
import com.interview.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface UserService {


    public User getUserDetailes(Long userId);
    public List<User> getAllUserDetailes();

    public User saveUserDetailes(User user);


    public User editUserDetailes(User user);

    public void deleteUserDetailes(Long userId);
}
