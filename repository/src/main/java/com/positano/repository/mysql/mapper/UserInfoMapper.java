package com.positano.repository.mysql.mapper;

import com.positano.repository.mysql.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    List<UserInfo> findAll();

}
