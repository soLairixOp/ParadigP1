
package Modelo;

public class Cliente {

    private int idCliente;
    private String nombre;
    private String noTelefono;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String noTelefono) {
        setIdCliente(idCliente);
        setNombre(nombre);
        setNoTelefono(noTelefono);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {

        String id = String.valueOf(idCliente);

        if (id.length() < 3 || id.length() > 10) {
            throw new IllegalArgumentException(
                    "El ID debe tener entre 3 y 10 dígitos.");
        }

        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío.");
        }

        this.nombre = nombre;
    }

    public String getNoTelefono() {
        return noTelefono;
    }

    public void setNoTelefono(String noTelefono) {

        if (!noTelefono.matches("\\d{10}")) {
            throw new IllegalArgumentException(
                    "El teléfono debe contener exactamente 10 dígitos.");
        }

        this.noTelefono = noTelefono;
    }
}
