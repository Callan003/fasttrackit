package org.fasttrackit.curs22;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handleResourceNotFoundException(ResourceNotFoundException exception){
        return new ApiError(exception.getMessage());
    }
}

class ApiError{
    private final String message;

    ApiError(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
