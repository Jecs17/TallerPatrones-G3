package Patron_Facade;

import Patron_Facade.SubsistemaCliente.Cliente;

public class FachadaTelefonica {
    private Tienda tienda;
    private Cliente subsistemaCliente; // Instancia genérica para acciones telefónicas

    public FachadaTelefonica(Tienda tiendaReferencia) {
        this.tienda = tiendaReferencia;
        this.subsistemaCliente = new Cliente("TelCliente");
        System.out.println("FachadaTelefonica: Inicializada.");
    }

    public void realizarAccionesCliente(String accion) {
        System.out.println("\nFachadaTelefonica: Solicitud de acción: '" + accion + "'");
        if (accion.equals("actualizar_datos")) {
            this.subsistemaCliente.realizarAccionEspecifica("actualización de datos");
            this.subsistemaCliente.getNotificador().enviarNotificacion("Sus datos han sido actualizados.");
        } else if (accion.equals("consultar_saldo")) {
            this.subsistemaCliente.realizarAccionEspecifica("consulta de saldo");
            this.subsistemaCliente.getNotificador().enviarNotificacion("Su saldo actual es $XXX."); // Simulacion
        } else {
            System.out.println("FachadaTelefonica: Acción '" + accion + "' no soportada por este canal.");
        }
    }
}
