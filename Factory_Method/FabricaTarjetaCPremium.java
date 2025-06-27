
public class FabricaTarjetaCPremium extends FabricaTarjetaCredito {
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        System.out.println("Fabrica Premium: Creando Tarjeta Premium...");
        return new TarjetaCPremium();
    }
}