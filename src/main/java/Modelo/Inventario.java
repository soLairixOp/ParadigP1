/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author guada
 */
public class Inventario {
   private ArrayList<Productos> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto) {
        productos.add(producto);
    }

    public boolean eliminarProducto(int id) {

        Productos producto = buscarProducto(id);

        if (producto == null) {
            return false;
        }

        productos.remove(producto);
        return true;
    }

    public Productos buscarProducto(int id) {

        for (Productos p : productos) {

            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    } 
}
