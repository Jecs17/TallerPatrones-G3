public abstract class TarjetaCredito {

    private double costoAnual;
    private double limiteCredito;

    // Constructor
    protected TarjetaCredito(double costoAnual, double limiteCredito) {
        this.costoAnual = costoAnual;
        this.limiteCredito = limiteCredito;
    }

    public double getCostoAnual() {
        return costoAnual;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getClass().getSimpleName() +
               ", Costo Anual: $" + String.format("%.2f", costoAnual) +
               ", Límite de Crédito: $" + String.format("%.2f", limiteCredito);
    }
}
