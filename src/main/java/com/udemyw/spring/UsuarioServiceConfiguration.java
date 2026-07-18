package com.udemyw.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioServiceConfiguration {
    @Bean("serviceAPI")

    public UsuarioService usuarioService()
    {
        return new UsuarioService(new UsuarioRepositoryAPI());
    }
}
