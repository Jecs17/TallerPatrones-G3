package Patron_Facade.SubsistemaPago;

public class Factura {
    private java.util.List<String> detalles;

    public Factura() {
        this.detalles = new java.util.ArrayList<>();
        System.out.println("Factura: Inicializada.");
    }

    public java.util.List<String> generarFactura(String clienteInfo, java.util.List<String> productosComprados, double total) {
        this.detalles.add("Factura generada para: " + clienteInfo);
        this.detalles.add("Productos: " + String.join(", ", productosComprados));
        this.detalles.add("Total: $" + total);
        System.out.println("Factura: Detalles de factura generados.");
        for (String detalle : this.detalles) {
            System.out.println("  - " + detalle);
        }
        return this.detalles;
    }
}

