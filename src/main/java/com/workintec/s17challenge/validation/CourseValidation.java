package com.workintec.s17challenge.validation;

import com.workintec.s17challenge.entity.Course;
import com.workintec.s17challenge.exceptions.ApiException;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

public class CourseValidation {
    public static void checkName(String name) {
        if (name == null || name.isEmpty()) {
            throw new ApiException("Name cannot be null or empty!", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkCredit(Integer credit) {
        if (credit == null || credit < 0 || credit > 4) {
            throw new ApiException("Credit is null or not between 0-4!", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkNameExist(List<Course> courses, String name) {
        Optional<Course> courseOptional = courses.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findAny();
        if (courseOptional.isPresent()) {
            throw new ApiException("Course already exist with name: " + name, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkId(Integer id) {
        if (id == null || id < 0) {
            throw new ApiException("Id cannot be null or less then zero!", HttpStatus.BAD_REQUEST);
        }
    }
}
