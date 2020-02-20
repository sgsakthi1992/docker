package com.sakthi.docker.service;

import com.sakthi.docker.model.Time;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    public Time getTime() {
        return Time.builder()
                .setTime(System.currentTimeMillis())
                .createTime();
    }
}
