import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TargetaCredito card = new TargetaCredito("123334", LocalDate.of(2025,5,5), 1000);
        JOptionPane.showMessageDialog(null, card);
        card.ProcessarPago(200,LocalDate.now());
        JOptionPane.showMessageDialog(null, card);
    }
}