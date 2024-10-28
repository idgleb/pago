import java.time.LocalDate;

public abstract class Pago {
    private double monto;
    private LocalDate fecha;


    public abstract boolean ProcessarPago(double monto, LocalDate fecha);

    @Override
    public String toString() {
        return "Pago{" +
                "monto=" + monto +
                ", fecha=" + fecha +
                '}';
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
