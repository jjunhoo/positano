package com.positano.internal.service.mysql;

import com.positano.core.mysql.entity.UserInfo;
import com.positano.core.mysql.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InternalMysqlService {

    private final UserInfoService userInfoService;

    public List<UserInfo> getAllUsers() {
        return userInfoService.getAllUsers();
    }

    public UserInfo getUserById(Long id) {
        return userInfoService.getUserById(id);
    }

}
