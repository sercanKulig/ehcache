package com.example.ehcache.loader;

import com.example.ehcache.entity.User;
import com.example.ehcache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {

    private UserRepository userRepository;

    @Autowired
    public Loader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void load() {
        List<User> usersList = getList();
        userRepository.saveAll(usersList);
    }

    private List<User> getList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Sercan", "Development", "1"));
        userList.add(new User("Gizem", "Art", "2"));
        userList.add(new User("Abidin", "Abidination", "3"));
        return userList;
    }
}
