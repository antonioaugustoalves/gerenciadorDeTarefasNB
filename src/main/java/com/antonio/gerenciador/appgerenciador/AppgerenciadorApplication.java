package com.antonio.gerenciador.appgerenciador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.antonio.gerenciador.appgerenciador.repositories")
@EntityScan("com.antonio.gerenciador.appgerenciador.models")
public class AppgerenciadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppgerenciadorApplication.class, args);
	}

}
