
package com.agenda.contactos;

// Importación de la clase SpringApplication
import org.springframework.boot.SpringApplication;

// Importación de la anotación SpringBootApplication 
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Declaración de la clase principal de la aplicación, marcada con la anotación SpringBootApplication
@SpringBootApplication
public class AgendaContactosSpringbootApplication {

	// Método principal que se ejecuta al iniciar la aplicación
	public static void main(String[] args) {
		// Llama al método run() de SpringApplication para arrancar la aplicación Spring
		// Boot
		SpringApplication.run(AgendaContactosSpringbootApplication.class, args);
	}
}
