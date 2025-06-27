package Patron_Facade;

import Patron_Facade.SubsistemaCliente.Cliente;
import Patron_Facade.SubsistemaPago.Factura;
import Patron_Facade.SubsistemaPago.Pago;
import Patron_Facade.SubsistemaProducto.CarritoDeCompra;
import Patron_Facade.SubsistemaProducto.Producto;

public class FachadaWebMovil {
    private Tienda tienda; // Referencia a la tienda si fuera necesario para algo más
    private java.util.Map<String, Producto> subsistemaProducto;
    private CarritoDeCompra carrito;
    private Pago pago;
    private Factura factura;

    public FachadaWebMovil(Tienda tiendaReferencia) {
        this.tienda = tiendaReferencia;
        this.subsistemaProducto = new java.util.HashMap<>();
        this.subsistemaProducto.put("p101", new Producto("p101", "Camiseta Deportiva", 25.00));
        this.subsistemaProducto.put("p102", new Producto("p102", "Pantalón Casual", 40.00));
        this.subsistemaProducto.put("p103", new Producto("p103", "Zumo Natural", 3.50));

        this.carrito = new CarritoDeCompra();
        this.pago = new Pago();
        this.factura = new Factura();
        System.out.println("FachadaWebMovil: Inicializada.");
    }

    public java.util.Map<String, Producto> mostrarProductos() {
        System.out.println("\nFachadaWebMovil: Mostrando productos disponibles para compra:");
        for (java.util.Map.Entry<String, Producto> entry : subsistemaProducto.entrySet()) {
            System.out.println("- [" + entry.getKey() + "] " + entry.getValue().getInfo());
        }
        return this.subsistemaProducto;
    }

    public java.util.List<String> seleccionarProductos(java.util.List<String> listaIdsProductos) {
        System.out.println("\nFachadaWebMovil: Seleccionando productos y añadiéndolos al carrito...");
        java.util.List<String> productosSeleccionados = new java.util.ArrayList<>();
        for (String prodId : listaIdsProductos) {
            if (subsistemaProducto.containsKey(prodId)) {
                Producto producto = subsistemaProducto.get(prodId);
                carrito.agregarProducto(producto);
                productosSeleccionados.add(producto.getNombre());
            } else {
                System.out.println("FachadaWebMovil: Advertencia - Producto con ID '" + prodId + "' no encontrado.");
            }
        }
        return productosSeleccionados;
    }

    public boolean realizarCompra(String idCliente) {
        System.out.println("\nFachadaWebMovil: Iniciando proceso de compra para cliente " + idCliente + "...");
        
        // 1. Obtener información del cliente (simulada)
        Cliente clienteSimulado = new Cliente(idCliente);
        String clienteInfo = clienteSimulado.obtenerInformacion();
        
        // 2. Calcular total del carrito
        double totalCompra = carrito.calcularTotal();
        
        if (totalCompra <= 0) {
            System.out.println("FachadaWebMovil: El carrito está vacío. No se puede realizar la compra.");
            return false;
        }

        // 3. Procesar pago
        if (pago.procesarPago(totalCompra)) {
            // 4. Obtener productos comprados del carrito
            java.util.List<String> productosCompradosNombres = carrito.obtenerNombresProductos();
            
            // 5. Generar factura
            factura.generarFactura(clienteInfo, productosCompradosNombres, totalCompra);
            
            // 6. Notificar al cliente (si la fachada lo gestiona o lo delega)
            clienteSimulado.getNotificador().enviarNotificacion("Su compra por $" + totalCompra + " ha sido exitosa. Factura enviada.");
            System.out.println("FachadaWebMovil: Compra para cliente " + idCliente + " completada exitosamente.");
            return true;
        } else {
            System.out.println("FachadaWebMovil: Error al procesar el pago para cliente " + idCliente + ".");
            return false;
        }
    }
}

