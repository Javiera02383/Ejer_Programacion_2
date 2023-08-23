// Importación de clases y paquetes necesarios
package com.agenda.contactos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agenda.contactos.modelo.Contacto;
import com.agenda.contactos.repositorio.ContactoRepositorio;

// Anotación, marca esta clase como un controlador de Spring MVC
@Controller
public class ContactoControlador {

	// Inyección de dependencia del repositorio de contactos
	@Autowired
	private ContactoRepositorio contactoRepositorio;

	// Método para manejar la ruta de inicio
	@GetMapping({ "/", "" }) // rutas
	public String verPaginaDeInicio(Model modelo) {
		// Obtiene la lista de todos los contactos desde el repositorio
		List<Contacto> contactos = contactoRepositorio.findAll();
		// Agrega la lista de contactos al modelo para su visualización en la vista
		modelo.addAttribute("contactos", contactos);
		// Devuelve el nombre de la vista a mostrar
		return "index";
	}

	// Método para mostrar el formulario de registro de contacto
	@GetMapping("/nuevo")
	public String mostrarFormularioDeRegistrarContacto(Model modelo) {
		// Agrega un objeto Contacto vacío al modelo para su uso en el formulario
		modelo.addAttribute("contacto", new Contacto());
		// Devuelve el nombre de la vista del formulario
		return "nuevo";
	}

	// Método para guardar un nuevo contacto
	@PostMapping("/nuevo")
	public String guardarContacto(@Validated Contacto contacto, BindingResult bindingResult,
			RedirectAttributes redirect, Model modelo) {
		// Verifica si hay errores de validación en el formulario
		if (bindingResult.hasErrors()) {
			// Agrega el objeto Contacto al modelo y devuelve la vista del formulario
			modelo.addAttribute("contacto", contacto);
			return "nuevo";
		}

		// Guarda el contacto en el repositorio
		contactoRepositorio.save(contacto);
		// Agrega un mensaje de éxito para mostrar en la página de inicio
		redirect.addFlashAttribute("msgExito", "El contacto ha sido agregado con éxito");
		// Redirige a la página de inicio
		return "redirect:/";
	}

	// Método para mostrar el formulario de edición de contacto
	@GetMapping("/{id}/editar")
	public String mostrarFormularioDeEditarContacto(@PathVariable Integer id, Model modelo) {
		// Obtiene el contacto a editar desde el repositorio
		Contacto contacto = contactoRepositorio.getById(id);
		// Agrega el contacto al modelo para su uso en el formulario de edición
		modelo.addAttribute("contacto", contacto);
		// Devuelve el nombre de la vista del formulario
		return "nuevo";
	}

	// Método para actualizar un contacto existente
	@PostMapping("/{id}/editar")
	public String actualizarContacto(@PathVariable Integer id, @Validated Contacto contacto,
			BindingResult bindingResult, RedirectAttributes redirect, Model modelo) {
		// Obtiene el contacto existente desde el repositorio
		Contacto contactoDB = contactoRepositorio.getById(id);
		// Verifica si hay errores de validación en el formulario
		if (bindingResult.hasErrors()) {
			// Agrega el objeto Contacto al modelo y devuelve la vista del formulario
			modelo.addAttribute("contacto", contacto);
			return "nuevo";
		}

		// Actualiza los datos del contacto existente con los datos del formulario
		contactoDB.setNombre(contacto.getNombre());
		contactoDB.setCelular(contacto.getCelular());
		contactoDB.setEmail(contacto.getEmail());
		contactoDB.setFechaNacimiento(contacto.getFechaNacimiento());

		// Guarda el contacto actualizado en el repositorio
		contactoRepositorio.save(contactoDB);
		// Agrega un mensaje de éxito para mostrar en la página de inicio
		redirect.addFlashAttribute("msgExito", "El contacto ha sido actualizado correctamente");
		// Redirige a la página de inicio
		return "redirect:/";
	}

	// Método para eliminar un contacto
	@PostMapping("/{id}/eliminar")
	public String eliminarContacto(@PathVariable Integer id, RedirectAttributes redirect) {
		// Obtiene el contacto a eliminar desde el repositorio
		Contacto contacto = contactoRepositorio.getById(id);
		// Elimina el contacto del repositorio
		contactoRepositorio.delete(contacto);
		// Agrega un mensaje de éxito para mostrar en la página de inicio
		redirect.addFlashAttribute("msgExito", "El contacto ha sido eliminado correctamente");
		// Redirige a la página de inicio
		return "redirect:/";
	}
}
