package Patron_Facade.SubsistemaProducto;

public class Producto {
private String idProducto;
    private String nombre;
    private double precio;

    public Producto(String idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        System.out.println("Producto: " + this.nombre + " (" + this.idProducto + ") a $" + this.precio + " creado.");
    }

    public String getInfo() {
        return nombre + " ($" + precio + ")";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
