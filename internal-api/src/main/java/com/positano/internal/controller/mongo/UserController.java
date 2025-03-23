package com.positano.internal.controller.mongo;

import com.positano.core.mongo.model.User;
import com.positano.internal.service.mongo.InternalMongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final InternalMongoService internalMongoService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return internalMongoService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return internalMongoService.getAllUsers();
    }
}

