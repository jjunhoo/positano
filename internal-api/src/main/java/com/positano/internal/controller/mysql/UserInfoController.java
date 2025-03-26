package com.positano.internal.controller.mysql;

import com.positano.core.mysql.entity.UserInfo;
import com.positano.internal.service.mysql.InternalMysqlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mysql")
public class UserInfoController {

    private final InternalMysqlService internalMysqlService;

    @GetMapping("/users")
    public List<UserInfo> getAllUsers() {
        return internalMysqlService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserInfo getUserById(@PathVariable Long id) {
        return internalMysqlService.getUserById(id);
    }

}
