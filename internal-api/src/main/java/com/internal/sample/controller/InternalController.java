package com.internal.sample.controller;

import com.internal.sample.service.InternalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dto.SampleDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class InternalController {

    private final InternalService internalService;

    /**
     * Sample Controller
     * @return
     */
    @GetMapping("/sample")
    public String sample() {
        SampleDto sampleDto = SampleDto.builder().name("Tom").age(30).build();
        log.info("core sampleDto - " + sampleDto.toString());

        return sampleDto.toString();
    }

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
