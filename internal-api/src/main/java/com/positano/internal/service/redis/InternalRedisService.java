package com.positano.internal.service.redis;

import com.positano.repository.redis.service.RedisService;
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

        int[] arr = new int[]{ 1,2,3 };


        return redisService.getData(key);
    }

}
