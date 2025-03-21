package com.positano.internal.service.mongo;

import com.positano.core.mongo.model.User;
import com.positano.core.mongo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InternalMongoService {

    private final UserService userService;

    public User createUser(User user) {
        return userService.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
