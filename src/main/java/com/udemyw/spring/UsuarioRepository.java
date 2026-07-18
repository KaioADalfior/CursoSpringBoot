package com.udemyw.spring;
import org.springframework.stereotype.Component;

@Component("repBanco")
public class UsuarioRepository implements InterfaceUsuarioRepository{
    @Override
    public void obterDados(){
        System.out.println("Obtendo dados do banco");
    }
}
