package com.pramod.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pramod.ecomerce.model.Role;
import lombok.Data;

@Data
public class RegisterDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long patientId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String username;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String firstname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String gender;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String country;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dob;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    private String contact;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Role role;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String avatar;


}
