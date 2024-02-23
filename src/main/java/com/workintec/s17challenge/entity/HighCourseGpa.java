package com.workintec.s17challenge.entity;

import org.springframework.stereotype.Component;

@Component
public class HighCourseGpa implements CourseGpa {
    @Override
    public int getGpa() {
        return 0;
    }
}
