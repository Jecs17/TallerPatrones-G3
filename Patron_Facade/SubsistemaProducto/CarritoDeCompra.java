package Patron_Facade.SubsistemaProducto;

public class CarritoDeCompra {
 private java.util.List<Producto> items;

    public CarritoDeCompra() {
        this.items = new java.util.ArrayList<>();
        System.out.println("CarritoDeCompra: Inicializado.");
    }

    public void agregarProducto(Producto producto) {
        this.items.add(producto);
        System.out.println("CarritoDeCompra: '" + producto.getNombre() + "' añadido.");
    }

    public void removerProducto(Producto producto) {
        this.items.remove(producto);
        System.out.println("CarritoDeCompra: '" + producto.getNombre() + "' removido.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto item : items) {
            total += item.getPrecio();
        }
        System.out.println("CarritoDeCompra: Total calculado: $" + total);
        return total;
    }
    
    public java.util.List<String> obtenerNombresProductos() {
        java.util.List<String> nombres = new java.util.ArrayList<>();
        for (Producto item : items) {
            nombres.add(item.getNombre());
        }
        return nombres;
    }
}
