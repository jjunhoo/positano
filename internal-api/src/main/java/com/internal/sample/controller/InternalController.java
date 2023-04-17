package com.internal.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.SampleDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class InternalController {

    @GetMapping("/sample")
    public String sample() {
        SampleDto sampleDto = SampleDto.builder().name("Tom").age(30).build();
        log.info("core sampleDto - " + sampleDto.toString());

        return sampleDto.toString();
    }

}
