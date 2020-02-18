package com.sakthi.docker.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TimeService {

    public Map<String, Long> getTime() {
        return new HashMap<String, Long>(
                Map.of("time", System.currentTimeMillis()));
    }
}
