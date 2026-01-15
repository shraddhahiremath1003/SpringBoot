package com.example.RestApiDemo.Exception;

import com.example.RestApiDemo.entity.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandlerClass {
    @ExceptionHandler(DuplicateName.class)
    public ResponseEntity<ErrorResponse> duplicteName(DuplicateName duplicateName, WebRequest webRequest){
        ErrorResponse errorResponse=new ErrorResponse(duplicateName.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<ErrorResponse> StudentNotFoun(StudentNotFound studentNotFound){
        ErrorResponse errorResponse=new ErrorResponse(studentNotFound.getMessage(),"Stud_Not_Found");
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
