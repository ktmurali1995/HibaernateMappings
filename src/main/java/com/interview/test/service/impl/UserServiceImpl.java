package com.interview.test.service.impl;

import com.interview.test.model.User;
import com.interview.test.repository.UserRepository;
import com.interview.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserDetailes(Long userId)
    {
        return userRepository.findById(userId).get();
    }
    @Override
    public List<User> getAllUserDetailes()
    {
        return userRepository.findAll();
    }
    @Override
    @Transactional
    public User saveUserDetailes(User user)
    {
        User user1=userRepository.findById(user.getUserId()).orElse(null);
        if(user1!=null) {
            user1.getPhones().addAll(user.getPhones());
            return userRepository.save(user1);
        }else {
            return userRepository.save(user);
        }
    }
    @Transactional
    @Override
    public User editUserDetailes(User user)
    {
        return userRepository.save(user);
    }
    @Override

    public void deleteUserDetailes(Long userId)
    {
        userRepository.deleteById(userId);
    }


}
