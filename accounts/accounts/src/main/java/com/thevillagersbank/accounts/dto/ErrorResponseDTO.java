package com.thevillagersbank.accounts.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

// Data annotation brings all the getters, setters, toString and allArgs constructor from lombok.
@Data @AllArgsConstructor
public class ErrorResponseDTO {
    
    private String apiPath;

    private HttpStatus erroCode;
    
    private String erroMsg;
    
    private LocalDateTime errorTime;
    
    
    
}
