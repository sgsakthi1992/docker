package com.sakthi.docker.model;

public final class Time {
    private final Long time;

    private Time(final TimeBuilder timeBuilder) {
        this.time = timeBuilder.time;
    }

    public Long getTime() {
        return time;
    }

    public static TimeBuilder builder(){
        return new TimeBuilder();
    }

    public static final class TimeBuilder{
        private Long time;

        public TimeBuilder setTime(Long time) {
            this.time = time;
            return this;
        }

        public Time createTime(){
            return new Time(this);
        }
    }
}
