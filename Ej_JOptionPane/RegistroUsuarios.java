package Ej_JOptionPane;

import javax.swing.JOptionPane;
import java.util.ArrayList;

// Clase principal que contiene el método main para ejecutar el programa
public class RegistroUsuarios {

    // ArrayList para almacenar los usuarios registrados
    private static ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();

    public static void main(String[] args) {
        boolean salir = false;

        // Bucle principal del programa que se ejecuta mientras no se elija la opción de
        // "Salir"
        while (!salir) {
            String opcion = mostrarMenuPrincipal();

            // Usamos un switch para determinar qué acción realizar en base a la opción
            // seleccionada
            switch (opcion) {
                case "1":
                    registrarUsuario();
                    break;
                case "2":
                    iniciarSesion();
                    break;
                case "3":
                    mostrarUsuariosRegistrados();
                    break;
                case "4":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
            }
        }
    }

    // Método para mostrar el menú principal y obtener la opción seleccionada
    private static String mostrarMenuPrincipal() {
        return JOptionPane.showInputDialog(
                "REGISTRO DE USUARIOS\n\n" +
                        "1. Registrarse\n" +
                        "2. Iniciar Sesión\n" +
                        "3. Mostrar Usuarios Registrados\n" +
                        "4. Salir\n\n" +
                        "Ingrese el número de la opción deseada:");
    }

    // Método para registrar un nuevo usuario
    private static void registrarUsuario() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String correo = JOptionPane.showInputDialog("Ingrese su correo electrónico:");
        String contrasena = JOptionPane.showInputDialog("Ingrese su contraseña:");

        // Creamos un nuevo objeto Usuario y lo agregamos al ArrayList de
        // usuariosRegistrados
        Usuario nuevoUsuario = new Usuario(nombre, correo, contrasena);
        usuariosRegistrados.add(nuevoUsuario);

        JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
    }

    // Método para iniciar sesión con un usuario registrado
    private static void iniciarSesion() {
        String correo = JOptionPane.showInputDialog("Ingrese su correo electrónico:");
        String contrasena = JOptionPane.showInputDialog("Ingrese su contraseña:");

        // Iteramos sobre el ArrayList de usuariosRegistrados buscando una coincidencia
        // de correo y contraseña
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena)) {
                // Si encontramos una coincidencia, mostramos un mensaje de bienvenida con el
                // nombre del usuario
                JOptionPane.showMessageDialog(null, "¡Inicio de sesión exitoso!\nBienvenido, " + usuario.toString());
                return;
            }
        }

        // Si no encontramos una coincidencia, mostramos un mensaje de error
        JOptionPane.showMessageDialog(null, "Correo electrónico o contraseña incorrectos.");
    }

    // Método para mostrar la lista de usuarios registrados
    private static void mostrarUsuariosRegistrados() {
        if (usuariosRegistrados.isEmpty()) {
            // Si no hay usuarios registrados, mostramos un mensaje indicando esto
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
        } else {
            // Si hay usuarios registrados, generamos un mensaje con la lista de usuarios
            StringBuilder usuarios = new StringBuilder("USUARIOS REGISTRADOS:\n\n");
            for (Usuario usuario : usuariosRegistrados) {
                usuarios.append(usuario.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, usuarios.toString());
        }
    }
}