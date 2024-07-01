package com.pramod.ecomerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponseError {
    private boolean  error;
    private String message;

}
