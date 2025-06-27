
public class Tienda {
    private String nombreTienda;
    private FabricaTarjetaCredito fabricaTarjetaC;

    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
    public void setFabricaTarjeta(FabricaTarjetaCredito fabrica) {
        this.fabricaTarjetaC = fabrica;
        System.out.println("Tienda: Fábrica configurada a " + fabrica.getClass().getSimpleName());
    }

    public void emitirTarjetaACliente(Cliente cliente) {
        FabricaTarjetaCredito fabricaParaCliente = null;

        // Lógica de decisión simplificada
        if (cliente.getNombre().contains("VIP")) { // Si el nombre contiene "VIP"
            fabricaParaCliente = new FabricaTarjetaCVip();
        } else if (cliente.getNombre().contains("Premium")) { // Si el nombre contiene "Premium"
            fabricaParaCliente = new FabricaTarjetaCPremium();
        } else { // Por defecto, es Básica
            fabricaParaCliente = new FabricaTarjetaCBasica();
        }
        this.setFabricaTarjeta(fabricaParaCliente);
        TarjetaCredito nuevaTarjeta = this.fabricaTarjetaC.crearTarjetaCredito();
        this.fabricaTarjetaC.ClienteRecibeTarjetaCredito(cliente);
        if (nuevaTarjeta != null) {
            cliente.setTarjeta(nuevaTarjeta);
        }
    }
}
