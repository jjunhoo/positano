package com.positano.repository.mysql.service;

import com.positano.repository.mysql.entity.UserInfo;
import com.positano.repository.mysql.mapper.UserInfoMapper;
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

    private final UserInfoMapper userInfoMapper;

    /**
     * JPA 기반 전체 조회
     * @return
     */
    public List<UserInfo> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * JPA 기반 ID 조회
     * @param id
     * @return
     */
    public UserInfo getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    /**
     * MyBatis 기반 조회
     * @return
     */
    public List<UserInfo> mybatisFindAll() {
        System.out.println(">>> MyBatis 호출 시도");
        List<UserInfo> result = userInfoMapper.findAll();
        System.out.println(">>> 조회된 수: " + result.size());

        return result;
        // return userInfoMapper.findAll();
    }
}
