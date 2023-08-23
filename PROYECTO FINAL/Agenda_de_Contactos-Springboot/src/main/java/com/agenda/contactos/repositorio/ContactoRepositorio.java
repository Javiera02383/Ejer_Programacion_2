
package com.agenda.contactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.contactos.modelo.Contacto;

// Interfaz que extiende JpaRepository para operaciones de acceso a datos de Contacto
public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {

    // No es necesario definir métodos aquí, ya que JpaRepository proporciona
    // métodos CRUD básicos
    // JpaRepository maneja la persistencia y acceso a la base de datos de la
    // entidad Contacto
    // Los métodos para buscar, guardar, actualizar y eliminar contactos son
    // heredados de JpaRepository

    // No se necesita implementar métodos en esta interfaz, Spring Data JPA lo hace
    // automáticamente
    // Al extender JpaRepository, Spring Data JPA crea automáticamente
    // implementaciones de los métodos
}
