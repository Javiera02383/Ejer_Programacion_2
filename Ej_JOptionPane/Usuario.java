package Ej_JOptionPane;

// Clase para representar un Usuario
class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;

    // Constructor para inicializar un usuario con su nombre, correo y contraseña
    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Métodos para obtener el correo y la contraseña del usuario
    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Método para obtener una representación en texto del usuario (nombre y correo)
    @Override
    public String toString() {
        return nombre + " (" + correo + ")";
    }
}