// Importación de clases y paquetes necesarios
package com.agenda.contactos.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

// Anotación que marca esta clase como una entidad JPA (base de datos)
@Entity
public class Contacto {

	// Atributo que se usará como clave primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoaumentante
	private Integer id;

	// Anotación para validar que el nombre no esté en blanco
	@NotBlank(message = "Debe ingresar su nombre")
	private String nombre;

	// Anotación para validar que el email no esté vacío y sea válido
	@NotEmpty(message = "Debe ingresar su email")
	@Email
	private String email;

	// Anotación para validar que el celular no esté en blanco
	@NotBlank(message = "Debe ingresar su celular")
	private String celular;

	// Anotación para indicar que la fecha debe estar en el pasado
	@DateTimeFormat(iso = ISO.DATE)
	@Past
	// Anotación para validar que la fecha de nacimiento no esté en blanco
	@NotNull(message = "Debe ingresar su fecha de nacimiento")
	private LocalDate fechaNacimiento;

	// Atributo para almacenar la fecha y hora de registro
	private LocalDateTime fechaRegistro;

	/*
	 * Getters y Setters
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	// Método que se ejecuta antes de persistir en la base de datos
	@PrePersist
	public void asignarFechaRegistro() {
		// Asigna la fecha y hora actuales
		fechaRegistro = LocalDateTime.now();
	}
}
