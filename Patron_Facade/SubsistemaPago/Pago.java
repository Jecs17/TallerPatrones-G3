package Patron_Facade.SubsistemaPago;

public class Pago {
    public Pago() {
        System.out.println("Pago: Inicializado.");
    }

    public boolean procesarPago(double cantidad) {
        System.out.println("Pago: Procesando pago de $" + cantidad + "...");
        // Lógica de procesamiento de pago real (ej. integrar con pasarela)
        System.out.println("Pago: Pago procesado exitosamente.");
        return true;
    }
}
