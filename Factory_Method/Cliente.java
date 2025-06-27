public class Cliente {
    private String nombre;
    private String celular;
    private TarjetaCredito tarjeta; 

    public Cliente(String nombre, String celular) {
        this.nombre = nombre;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
        System.out.println(nombre + " ha recibido su " + tarjeta.getClass().getSimpleName() + ".");
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

}
