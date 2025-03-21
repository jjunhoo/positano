package com.positano.internal.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.positano.core.service.RedisService;

@Service
@RequiredArgsConstructor
public class InternalService {

    private final RedisService redisService;

    /**
     * Redis - set
     * @param key
     * @param value
     * @return
     */
    public String setRedisData(String key, String value) {
        redisService.saveData(key, value);
        return "Data saved!";
    }

    /**
     * Redis - get
     * @param key
     * @return
     */
    public Object getRedisData(String key) {
        return redisService.getData(key);
    }

}
