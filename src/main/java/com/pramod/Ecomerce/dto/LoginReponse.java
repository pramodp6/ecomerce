package com.pramod.ecomerce.dto;


import lombok.Data;

@Data
public class LoginReponse {

    private String token;
    private String email;
    private String password;
}
