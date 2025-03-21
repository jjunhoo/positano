package com.positano.internal.controller.redis;

import com.positano.internal.service.InternalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {

    private final InternalService internalService;

    /**
     * Redis - Sample Controller
     * @param key
     * @param value
     * @return
     */
    @GetMapping("/set/{key}/{value}")
    public String setRedisData(@PathVariable String key, @PathVariable String value) {
        internalService.setRedisData(key, value);
        return "Data saved!";
    }

    @GetMapping("/get/{key}")
    public Object getRedisData(@PathVariable String key) {
        return internalService.getRedisData(key);
    }

}
