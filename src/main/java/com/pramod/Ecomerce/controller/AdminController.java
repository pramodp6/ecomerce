package com.pramod.ecomerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @PutMapping("/updateProfileImage/{id}")
    public String updateProfileImage(){
        return "updateProfileImage";
    }
    @PutMapping("/updateDetails/{id}")
    public String updateDetails(){
        return "AdminDetails";
    }

    @PutMapping("/passwordChange/{id}")
    public String adminPasswordChange(){
        return "adminPasswordChange";
    }


    @PostMapping("/passwordReset")
    public String passwordReset(){
        return "passwordReset";
    }

    @PostMapping("/passwordResendAdmin")
    public String resendAdminpassword(){
        return "resendAdminpassword";
    }


    @PostMapping("/passwordVerfy")
    public String passwordVerifyAdmin(){
        return "passwordVerifyAdmin";
    }









    @GetMapping("/allUsers")
    public String allUsers(){
        return "allUsers";
    }

    @DeleteMapping("/usersId")
    public String usersDelete(){
        return "ProductCreate";
    }


    @PostMapping("/productCreate")
    public String productCreate(){
        return "ProductCreate";
    }



    @PutMapping("/productUpdate/{id}")
    public String productUpdate(){
        return "ProductCreate";
    }

    @DeleteMapping("/productDelete/{id}")
    public String productDelete(){
        return "ProductCreate";
    }
}
