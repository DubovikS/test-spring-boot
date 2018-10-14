package com.sergey.music.Interfaces.UserInterface;

import com.sergey.music.entity.User;
import com.sergey.music.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserInterface {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
