package Modelo;

public class Empleado extends Usuario {

    public Empleado() {
    }

    public Empleado(int idUsuario, String nombre, String contraseña) {
        
        super(idUsuario, nombre, contraseña);
    }

    public void realizarVenta() {
        System.out.println("Venta realizada.");
    }

    public void registrarPedido() {
        System.out.println("Pedido registrado.");
    }

    public void consultarInventario() {
        System.out.println("Consultando inventario.");
    }
}

