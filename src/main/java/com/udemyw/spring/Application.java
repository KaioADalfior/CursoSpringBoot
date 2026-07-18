package com.udemyw.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	//spring resolve a dependencia por mim
	@Autowired
	@Qualifier("serviceAPI")
	
	UsuarioService serv;
	Application(UsuarioService serv) {
		this.serv = serv;
	}
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		serv.obterUsuario();
	}
}
