package com.example.RestApiDemo.Exception;

public class DuplicateName extends RuntimeException{
    public DuplicateName(String message){
        super(message);
    }
}
