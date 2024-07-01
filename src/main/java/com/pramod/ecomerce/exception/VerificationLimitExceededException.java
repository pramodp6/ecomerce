package com.pramod.ecomerce.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
public class VerificationLimitExceededException extends RuntimeException{
    public VerificationLimitExceededException(String message){
        super(message);

    }
}
