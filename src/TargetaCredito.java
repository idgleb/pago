import javax.swing.*;
import java.time.LocalDate;

public class TargetaCredito extends Pago {

    private String numTrjeta;
    private LocalDate venicimiento;
    private double limite;

    public TargetaCredito(String numTrjeta, LocalDate venicimiento, double limite) {
        this.numTrjeta = numTrjeta;
        this.venicimiento = venicimiento;
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "TargetaCredito{" +
                "numTrjeta='" + numTrjeta + '\'' +
                ", venicimiento=" + venicimiento +
                ", limite=" + limite +
                "} " + super.toString();
    }

    @Override
    public boolean ProcessarPago(double monto, LocalDate fecha) {

        if (fecha.isAfter(venicimiento)) {
            JOptionPane.showInputDialog(null, "la tarjeta ha caducado");
            return false;
        }

        if (monto <= this.limite) {
            this.limite -= monto;
            JOptionPane.showMessageDialog(null, "Pago realizado com sucesso");
        }else {
            JOptionPane.showInputDialog(null, "no tenes limete");
        }

        return true;
    }
}
