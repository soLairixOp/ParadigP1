
package Modelo;

public class Productos {
    private int id;
    private String nombre;
    private double precio;
    private String imagen;
    private int unidades;
    private String estado;
    private CategoriaProducto categoria;

    public Productos() {
    }

    public Productos(int id,String nombre,double precio,String imagen,int unidades,CategoriaProducto categoria) {

        setId(id);
        setNombre(nombre);
        setPrecio(precio);
        setImagen(imagen);
        setUnidades(unidades);
        setCategoria(categoria);
    }

    public Productos(String nombre,double precio,String imagen,int unidades,CategoriaProducto categoria) {

        setNombre(nombre);
        setPrecio(precio);
        setImagen(imagen);
        setUnidades(unidades);
        setCategoria(categoria);
    }

    // GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {

        if (id <= 0) {
            throw new IllegalArgumentException(
                    "El ID debe ser mayor que 0");
        }

        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "Nombre inválido");
        }

        nombre = nombre.trim();

        String[] palabras = nombre.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String palabra : palabras) {

            sb.append(Character.toUpperCase(palabra.charAt(0))
            );

            if (palabra.length() > 1) {
                sb.append(palabra.substring(1).toLowerCase());
            }

            sb.append(" ");
        }

        this.nombre = sb.toString().trim();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio < 0) {
            throw new IllegalArgumentException("Precio inválido");
        }

        this.precio =Math.round(precio * 100.0) / 100.0;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {

        if (imagen == null || imagen.isBlank()) {
            this.imagen = "sin_imagen.png";
            return;
        }

        this.imagen = imagen.trim();
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {

        if (unidades < 0) {
            throw new IllegalArgumentException("Las unidades no pueden ser negativas");
        }

        this.unidades = unidades;

        actualizarEstado();
    }

    public String getEstado() {
        return estado;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(
            CategoriaProducto categoria) {

        this.categoria = categoria;
    }

    private void actualizarEstado() {

        estado = unidades > 0
                ? "Con existencia"
                : "Sin existencia";
    }

    @Override
    public String toString() {
        return nombre + " (" + categoria + ")";
    }
}
