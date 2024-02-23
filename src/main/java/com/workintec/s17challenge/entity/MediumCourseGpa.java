package com.workintec.s17challenge.entity;

import org.springframework.stereotype.Component;

@Component
public class MediumCourseGpa implements CourseGpa {
    @Override
    public int getGpa() {
        return 5;
    }
}
