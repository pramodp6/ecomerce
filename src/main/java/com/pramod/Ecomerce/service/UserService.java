package com.pramod.ecomerce.service;

import com.pramod.ecomerce.dto.RegisterDto;

import com.pramod.ecomerce.model.User;
import com.pramod.ecomerce.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {



    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;



    public boolean createUser(RegisterDto userDetailsResponse){
        if (userRepository.findByEmail(userDetailsResponse.getEmail()) != null) {
            return false;
        }

        User  user  = new User();
        user.setUsername(userDetailsResponse.getUsername());
        user.setFirstName(userDetailsResponse.getFirstname());
        user.setLastName(userDetailsResponse.getLastname());
        user.setEmail(userDetailsResponse.getEmail());
        user.setPassword(userDetailsResponse.getPassword());
        user.setContact(userDetailsResponse.getContact());
        user.setCountry(userDetailsResponse.getCountry());
        user.setDob(userDetailsResponse.getDob());
        user.setGender(userDetailsResponse.getGender());
        user.setEnabled(false);
        user.setCreatedAt(LocalDateTime.now());
        user.setAddress(userDetailsResponse.getAddress());
        userRepository.save(user);

        return true;
    }
}
