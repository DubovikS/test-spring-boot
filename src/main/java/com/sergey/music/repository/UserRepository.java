package com.sergey.music.repository;

import com.sergey.music.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String username);
}
