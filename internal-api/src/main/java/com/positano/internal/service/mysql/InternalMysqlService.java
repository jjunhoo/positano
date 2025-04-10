package com.positano.internal.service.mysql;

import com.positano.repository.mysql.entity.UserInfo;
import com.positano.repository.mysql.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InternalMysqlService {

    private final UserInfoService userInfoService;

    /**
     * JPA 기반 전체 조회
     * @return
     */
    public List<UserInfo> getAllUsers() {
        return userInfoService.getAllUsers();
    }

    /**
     * JPA 기반 ID 조회
     * @param id
     * @return
     */
    public UserInfo getUserById(Long id) {
        return userInfoService.getUserById(id);
    }

    /**
     * MyBatis 기반 조회
     * @return
     */
    public List<UserInfo> mybatisFindAll() {
        return userInfoService.mybatisFindAll();
    }
}
