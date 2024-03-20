package com.thevillagersbank.accounts.dto;

import lombok.Data;

// Data annotation brings all the getters, setters, toString and args from lombok.
@Data
public class ResponseDTO {
    
    private String statusCode;

    private String statusMsg;
    
    
    
}
