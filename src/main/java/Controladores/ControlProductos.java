package Controladores;

import Modelo.CategoriaProducto;
import Modelo.Productos;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author guada
 */

public class ControlProductos {

    private final String ARCHIVO = "productos.csv";
    private ArrayList<Productos> productos;

    public ControlProductos() {

        productos = new ArrayList<>();

        cargarProductos();

        // Datos de prueba
        if (productos.isEmpty()) {

            productos.add(new Productos(1,"Cuernito",10.00, "sin_imagen.png",25, CategoriaProducto.PAN_DULCE));
            productos.add(new Productos(2,"Concha",12.50, "sin_imagen.png",40,CategoriaProducto.PAN_DULCE));
            productos.add(new Productos(3,"Bolillo",3.50,"sin_imagen.png", 100,CategoriaProducto.PAN_DE_SAL));
            productos.add(new Productos(4,"Dona Azucar",15.00,"sin_imagen.png",20,CategoriaProducto.PAN_DULCE));
            productos.add(new Productos(5,"Pan Integral",20.00, "sin_imagen.png",15,CategoriaProducto.PAN_INTEGRAL));
            productos.add(new Productos(6,"Pastel Chocolate",350.00, "sin_imagen.png", 3,CategoriaProducto.REPOSTERIA ));
            productos.add(new Productos(7,"Marranito",8.00,"sin_imagen.png",30,CategoriaProducto.PAN_DULCE));
            productos.add(new Productos(8,"Oreja",11.00,"sin_imagen.png",25,CategoriaProducto.PAN_DULCE));
            productos.add(new Productos(9,"Bigote",10.50,"sin_imagen.png",18,CategoriaProducto.PAN_DULCE));
            productos.add(new Productos(10,"Polvoron",9.00,"sin_imagen.png",35,CategoriaProducto.PAN_DULCE));
            productos.add(new Productos(11,"pay",18.00,"sin_imagen.png",0,CategoriaProducto.REPOSTERIA));
            productos.add(new Productos(12,"Chilindrina",13.50,"sin_imagen.png",20,CategoriaProducto.PAN_DULCE));
            productos.add(new Productos(13,"Telera",5.00,"sin_imagen.png",15,CategoriaProducto.PAN_DE_SAL));

            guardarProductos();
        }
    }

    private void cargarProductos() {

        File archivo = new File(ARCHIVO);

        if (!archivo.exists()) {
            try (PrintWriter pw = new PrintWriter(archivo)) {
                pw.println("id,nombre,precio,imagen,unidades,categoria");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return;
        }

        try (BufferedReader br =new BufferedReader(new FileReader(archivo))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                double precio = Double.parseDouble(datos[2]);
                String imagen = datos[3];
                int unidades = Integer.parseInt(datos[4]);

                CategoriaProducto categoria =CategoriaProducto.valueOf(datos[5]);

                productos.add(
                        new Productos(id,nombre,precio,imagen,unidades,categoria));
            }
        } catch (Exception e) {
            System.out.println("Error al cargar productos: "+ e.getMessage());
        }
    }

    private void guardarProductos() {

        try (PrintWriter pw =new PrintWriter(new FileWriter(ARCHIVO))) {
            pw.println("id,nombre,precio,imagen,unidades,categoria");
            for (Productos p : productos) {

                pw.println(p.getId() + ","
                        + p.getNombre() + ","
                        + p.getPrecio() + ","
                        + p.getImagen() + ","
                        + p.getUnidades() + ","
                        + p.getCategoria());
            }

        } catch (Exception e) {
            System.out.println("Error al guardar: "+ e.getMessage());
        }
    }

    public boolean agregarProducto(Productos producto) {

        if (buscarProducto(producto.getId()) != null) {
            return false;
        }
        productos.add(producto);
        guardarProductos();
        return true;
    }

    public boolean eliminarProducto(int id) {

        Productos producto = buscarProducto(id);

        if (producto == null) {
            return false;
        }

        productos.remove(producto);
        guardarProductos();
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

    public boolean agregarUnidades(int id,int cantidad) {
        
        if (cantidad <= 0) {
            return false;
        }

        Productos producto =buscarProducto(id);

        if (producto == null) {
            return false;
        }
        producto.setUnidades(producto.getUnidades()+ cantidad);
        guardarProductos();
        return true;
    }

    public boolean descontarUnidades(int id,int cantidad) {

        if (cantidad <= 0) {
            return false;
        }

        Productos producto =buscarProducto(id);

        if (producto == null) {
            return false;
        }

        if (cantidad >producto.getUnidades()) {
            return false;
        }

        producto.setUnidades(producto.getUnidades()- cantidad);
        guardarProductos();
        return true;
    }

    public boolean modificarProducto(int id,String nombre,double precio,String imagen,int unidades,CategoriaProducto categoria) {

        Productos producto =buscarProducto(id);

        if (producto == null) {return false;}

        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setImagen(imagen);
        producto.setUnidades(unidades);
        producto.setCategoria(categoria);

        guardarProductos();

        return true;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public ArrayList<Productos> obtenerPorCategoria(CategoriaProducto categoria) {

        ArrayList<Productos> lista =new ArrayList<>();

        for (Productos p : productos) {
            if (p.getCategoria() == categoria) {
                lista.add(p);
            }
        }
        return lista;
    }
}