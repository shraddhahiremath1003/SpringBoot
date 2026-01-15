package com.example.RestApiDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ErrorResponse {
    String errMessage;
    String errorCode;
}
