package com.sergey.music.Interfaces.UserInterface;

import com.sergey.music.entity.User;

public interface UserInterface {

    User findByUserName(String username);
    void save (User user);
}
