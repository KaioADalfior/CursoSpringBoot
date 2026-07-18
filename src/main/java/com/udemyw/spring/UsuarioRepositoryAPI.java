package com.udemyw.spring;
import org.springframework.stereotype.Component;

@Component("repAPI")

public class UsuarioRepositoryAPI implements InterfaceUsuarioRepository{
    @Override
    public void obterDados(){
        System.out.println("Retornando dados da API");
    }
}
