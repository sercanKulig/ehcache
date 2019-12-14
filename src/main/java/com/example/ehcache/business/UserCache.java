package com.example.ehcache.business;

import com.example.ehcache.entity.User;
import com.example.ehcache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UserCache {

    private UserRepository userRepository;

    @Autowired
    public UserCache(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Cacheable(value = "usersCache", key = "#name")
    public User getUser(String name) {
        System.out.println("retrieve data from db")
        ;return userRepository.findByName(name);
    }
}
