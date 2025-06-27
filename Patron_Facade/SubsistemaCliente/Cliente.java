package Patron_Facade.SubsistemaCliente;

public class Cliente {
    private String idCliente;
    private Notificador notificador;

    public Cliente(String idCliente) {
        this.idCliente = idCliente;
        this.notificador = new Notificador();
        System.out.println("Cliente " + this.idCliente + ": Inicializado.");
    }

    public String obtenerInformacion() {
        return "Información del cliente " + this.idCliente;
    }

    public void realizarAccionEspecifica(String accion) {
        System.out.println("Cliente " + this.idCliente + ": Realizando acción específica: " + accion);
    }

    public Notificador getNotificador() {
        return notificador;
    }
}

