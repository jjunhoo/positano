package com.positano.repository.mysql.service;

import com.positano.repository.mysql.entity.UserInfo;
import com.positano.repository.mysql.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserInfoService {

    private final UserInfoRepository userRepository;

    public List<UserInfo> getAllUsers() {
        return userRepository.findAll();
    }

    public UserInfo getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
