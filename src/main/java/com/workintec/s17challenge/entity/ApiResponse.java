package com.workintec.s17challenge.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {
    private Course course;
    private Integer totalGpa;
}
