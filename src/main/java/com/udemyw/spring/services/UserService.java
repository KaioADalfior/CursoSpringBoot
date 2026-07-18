package com.udemyw.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemyw.spring.DTO.UserDTO;
import com.udemyw.spring.entities.User;
import com.udemyw.spring.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository rep;

    public User saveByDTO(UserDTO dto){
        User user = rep.save(dto.toUser());
        return user;
    }
}
