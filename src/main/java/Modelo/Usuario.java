// Alejandra Guadarrama Garcia
// Jose Maria Rodriguez Hernandez
//Carlos Alfonso Hernandez Hernandez

package Modelo;

public class Usuario {

    protected int idUsuario;
    protected String nombre;
    protected String contraseña;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String contraseña) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        setContraseña(contraseña);
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }

    // GETTERS Y SETTERS

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {

        String id = String.valueOf(idUsuario);

        if (id.length() < 3 || id.length() > 10) {
            throw new IllegalArgumentException(
                    "El ID debe tener entre 3 y 10 dígitos.");
        }

        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío.");
        }

        // Solo letras y espacios
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            throw new IllegalArgumentException(
                    "El nombre solo puede contener letras.");
        }

        // Primera letra mayúscula de cada palabra
        String[] palabras = nombre.trim().split("\\s+");
        String nombreFormateado = "";

        for (String palabra : palabras) {
            nombreFormateado += palabra.substring(0, 1).toUpperCase()
                    + palabra.substring(1).toLowerCase() + " ";
        }

        this.nombre = nombreFormateado.trim();
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {

        if (contraseña == null) {
            throw new IllegalArgumentException(
                    "La contraseña no puede ser nula.");
        }

        if (contraseña.length() < 8 || contraseña.length() > 10) {
            throw new IllegalArgumentException(
                    "La contraseña debe tener entre 8 y 10 caracteres.");
        }

        this.contraseña = contraseña;
    }
}
