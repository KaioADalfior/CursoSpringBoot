package com.udemyw.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemyw.spring.DTO.UserDTO;
import com.udemyw.spring.services.UserService;


@Controller
public class LoginController {
    @Autowired
    UserService service;
    
    @GetMapping("/register")
    public String register(){
        return "register";
    } 

    @PostMapping("/register")
    public String postRegister(@RequestParam Map<String, String> body) {
        //receber dados do usuário para cadastro
        //mapeio, pego os dados, chamo o service para salvar a DTo
        UserDTO dto = new UserDTO(body.get("email"), body.get("password"), body.get("name"));
        service.saveByDTO(dto);


        return "login";
    }
    

}
