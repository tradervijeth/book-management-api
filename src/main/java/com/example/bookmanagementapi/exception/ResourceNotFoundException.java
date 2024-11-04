// src/main/java/com/example/bookmanagementapi/exception/ResourceNotFoundException.java
package com.example.bookmanagementapi.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}