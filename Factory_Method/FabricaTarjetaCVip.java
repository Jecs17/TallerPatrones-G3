
public class FabricaTarjetaCVip extends FabricaTarjetaCredito {

    @Override
    public TarjetaCredito crearTarjetaCredito() {
        System.out.println("Fabrica VIP: Creando Tarjeta VIP...");
        return new TarjetaCVip();
    }
}