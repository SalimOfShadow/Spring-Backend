package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {

        userList = new ArrayList<>();

        User user1 = new User(1, "Joe", false, 12, "email@email.email");
        User user2 = new User(2, "Jessy", false, 22, "email2@email2.email");
        User user3 = new User(3, "Mike", true, 30, "email3@email3.email");
        User user4 = new User(4, "Alice", true, 25, "email4@email4.email");
        User user5 = new User(5, "Bob", false, 28, "email5@email5.email");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional getUserById(Integer id) {
        Optional<Object> optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
