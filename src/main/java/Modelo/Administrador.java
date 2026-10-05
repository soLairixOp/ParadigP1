
package Modelo;

public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(int idUsuario, String nombre, String contraseña) {
        super(idUsuario, nombre, contraseña);
    }
    
    public void gestionarProductos() {
        System.out.println("Gestionando productos.");
    }

    public void gestionarInventario() {
        System.out.println("Gestionando inventario.");
    }

    public void generarReporte() {
        System.out.println("Generando reporte.");
        
    }
}
