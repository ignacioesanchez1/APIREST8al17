package com.example.inicial1;

import com.example.inicial1.entities.*;
import com.example.inicial1.repositories.*;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication

public class Inicial1Application {
	private static final Logger logger = LoggerFactory.getLogger(Inicial1Application.class);

	@Autowired
	private PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Inicial1Application.class, args);

		System.out.println("funcionando");
	}

	/*@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository) {
		return args -> {
			// Creo un objeto persona

			Persona persona1 = Persona.builder().
					nombre("Rosa).apellido("Martinez").dni(24654355).
					build();


			Localidad local1= Localidad.builder().denominacion("Mendoza").build();
			Domicilio dom1 = Domicilio.builder().
					calle("Svega").localidad(local1)
					.numero(2333).build();

			persona1.setDomicilio(dom1);

			personaRepository.save(persona1);

// Creo otra persona
			Persona per2 = Persona.builder().
					nombre("fede").apellido("bal").
					build();

			Domicilio dom2 = Domicilio.builder().
					calle("Jujuy").localidad(local1)
					.numero(3329).build();

			per2.setDomicilio(dom2);


			// Lo grabo a través del repositorio de Spring
			personaRepository.save(per2);

			List<Persona> recuperadas = personaRepository.findAll();
			System.out.println(recuperadas);

			logger.info("Detalles de la persona: {}", recuperadas);


			Optional<Persona> recuperada = personaRepository.findById(1L);
			System.out.println(recuperada);

			logger.info("Detalles de la persona: {}", recuperada);


			dom1.setCalle("Rodriguezaaaa");

			personaRepository.save(persona1);


		};
	}*/
}












