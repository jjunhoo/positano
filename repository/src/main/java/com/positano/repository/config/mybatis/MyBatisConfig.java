package com.positano.repository.config.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.positano.repository.mysql.mapper")
public class MyBatisConfig {
}
