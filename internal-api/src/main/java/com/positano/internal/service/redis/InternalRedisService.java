package com.positano.internal.service.redis;

import com.positano.core.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InternalRedisService {

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
