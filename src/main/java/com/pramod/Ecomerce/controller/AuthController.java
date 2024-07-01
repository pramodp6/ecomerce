package com.pramod.ecomerce.controller;


import com.pramod.ecomerce.dto.LoginReponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@CrossOrigin("*")
public class AuthController {

    @PostMapping("/login")
    public String  authLogin(@RequestBody LoginReponse loginReponse){
        return loginReponse.getPassword();
    }
}
