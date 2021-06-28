import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.zip.ZipEntry;

public class ControleFluxo6 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
            System.out.println("Codigo consumindo RAM");
        }
    }
}
