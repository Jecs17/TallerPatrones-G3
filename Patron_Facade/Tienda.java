package Patron_Facade;

public class Tienda {
    private FachadaWebMovil fachadaWebMovil;
    private FachadaTelefonica fachadaTelefonica;

    public Tienda() {
        this.fachadaWebMovil = new FachadaWebMovil(this);
        this.fachadaTelefonica = new FachadaTelefonica(this);
        System.out.println("Tienda: Sistema inicializado.");
    }

    public void iniciarCompraWebMovil(String idCliente, java.util.List<String> productosDeseadosIds) {
        System.out.println("\n--- TIENDA: Cliente " + idCliente + " inicia proceso de compra Web/Móvil ---");
        this.fachadaWebMovil.mostrarProductos();
        this.fachadaWebMovil.seleccionarProductos(productosDeseadosIds);
        this.fachadaWebMovil.realizarCompra(idCliente);
        System.out.println("--- TIENDA: Proceso de compra Web/Móvil finalizado para cliente " + idCliente + " ---\n");
    }

    public void realizarGestionTelefonica(String accion) {
        System.out.println("\n--- TIENDA: Cliente inicia gestión telefónica ---");
        this.fachadaTelefonica.realizarAccionesCliente(accion);
        System.out.println("--- TIENDA: Gestión telefónica finalizada ---\n");
    }

    public static void main(String[] args) {
        Tienda miTienda = new Tienda();

        // Escenario de compra a través de la fachada Web/Móvil
        java.util.List<String> productosCliente1 = new java.util.ArrayList<>();
        productosCliente1.add("p101");
        productosCliente1.add("p103");
        miTienda.iniciarCompraWebMovil("C001", productosCliente1);

        // Escenario de una acción a través de la fachada Telefónica
        miTienda.realizarGestionTelefonica("actualizar_datos");

        // Otro escenario de compra con diferentes productos
        java.util.List<String> productosCliente2 = new java.util.ArrayList<>();
        productosCliente2.add("p102");
        productosCliente2.add("p101");
        miTienda.iniciarCompraWebMovil("C002", productosCliente2);

        // Intentar comprar con carrito vacío
        System.out.println("\n--- TIENDA: Intentando compra con carrito vacío ---");
        // Para simular un carrito vacío, podríamos crear una nueva instancia de FachadaWebMovil
        // o añadir un método para vaciar el carrito si estuviera modelado así.
        // Aquí simulamos creando una fachada nueva para que su carrito esté vacío por defecto.
        FachadaWebMovil fachadaVacia = new FachadaWebMovil(miTienda);
        fachadaVacia.realizarCompra("C003");
        System.out.println("--- TIENDA: Intento de compra con carrito vacío finalizado ---\n");
    }
}
