package com.udemyw.spring;
import org.springframework.beans.factory.annotation.Qualifier;

public class UsuarioService {
    
    
    InterfaceUsuarioRepository rep; //depende apenas da interface
    public UsuarioService(@Qualifier("repBanco") InterfaceUsuarioRepository rep){ // não explicou direito cof cof
        this.rep = rep; //recebe um novo rep.
    }


    public void obterUsuario(){
        rep.obterDados();
    }
}
