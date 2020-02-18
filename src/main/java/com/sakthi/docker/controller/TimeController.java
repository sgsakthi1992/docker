package com.sakthi.docker.controller;

import com.sakthi.docker.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(final TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public Map<String, Long> getTime(){
        return timeService.getTime();
    }
}
