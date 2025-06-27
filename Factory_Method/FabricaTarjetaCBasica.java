
public class FabricaTarjetaCBasica extends FabricaTarjetaCredito {

    @Override
    public TarjetaCredito crearTarjetaCredito() {
        System.out.println("Fabrica Básica: Creando Tarjeta Básica...");
        return new TarjetaCBasica();
    }
}