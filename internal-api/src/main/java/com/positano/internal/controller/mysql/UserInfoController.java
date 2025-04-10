package com.positano.internal.controller.mysql;

import com.positano.internal.service.mysql.InternalMysqlService;
import com.positano.repository.mysql.entity.UserInfo;
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

    /**
     * JPA 기반 전체 조회
     * @return
     */
    @GetMapping("/users")
    public List<UserInfo> getAllUsers() {
        return internalMysqlService.getAllUsers();
    }

    /**
     * JPA 기반 ID 조회
     * @param id
     * @return
     */
    @GetMapping("/users/{id}")
    public UserInfo getUserById(@PathVariable Long id) {
        return internalMysqlService.getUserById(id);
    }

    /**
     * MyBatis 기반 조회
     * @return
     */
    @GetMapping("/mybatis/users")
    public List<UserInfo> mybatisFindAll() {
        return internalMysqlService.mybatisFindAll();
    }
}
