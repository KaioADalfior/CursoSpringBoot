package com.udemyw.spring.DTO;
import com.udemyw.spring.entities.User;

public record UserDTO (String email, String password, String name){
    
    //converte dto para user
    public User toUser()
    {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);

        return user;
    }
}
