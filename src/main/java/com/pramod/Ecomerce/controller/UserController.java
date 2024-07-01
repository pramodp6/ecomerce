package com.pramod.ecomerce.controller;


import com.pramod.ecomerce.dto.ApiResponse;
import com.pramod.ecomerce.dto.ApiResponseError;
import com.pramod.ecomerce.dto.RegisterDto;

import com.pramod.ecomerce.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;



    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@RequestBody RegisterDto registerDto) {

        boolean createUser = userService.createUser(registerDto);
        System.out.print(registerDto.getEmail() + "Noida");

        if (createUser) {
            return ResponseEntity.ok().body(new ApiResponse(createUser, "Register Record SucessFully verification sent Email!", null));
        } else {
            return ResponseEntity.badRequest().body(new ApiResponseError(createUser, "Email already Exists!"));

        }



}

    @PostMapping("/otpVerify")
    public String otpVerify(){
        return "otpVerify";
    }

    @PostMapping("/resendOtp")
    public String resendOtp(){
        return "resendOtp";
    }
    @PostMapping("/resetPassword")
    public String resetpassword(){
        return "resetpassword";
    }

    @PostMapping("/resendPasswordOtp")
    public String resendPasswordOtp(){
        return "resendPasswordOtp";

    }




    @PostMapping("/profileImage")
    public String profileImage(){
        return "profileImage";
    }

    @PostMapping("/profileUpdate")
    public String profileUpdate(){
        return "profileUpdate";
    }

    @PostMapping("/passwordChange")
    public String passwordChange(){
        return "passwordChange";
    }


}
