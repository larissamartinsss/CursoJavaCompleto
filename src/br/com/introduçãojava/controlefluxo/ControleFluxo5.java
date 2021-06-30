package br.com.introduçãojava.controlefluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Porém, as parcelas não podem ser menores do que 1000.

        //MANEIRA 1:
        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }else {
                System.out.println("Saindo do laço");
            break;
            }
            System.out.println("fora do laço");
        }
        // MANEIRA 2:

        int valueSum = 30000;
        for (int installment =1; installment <= valueSum; installment++) {
            int installmentTotal = valueSum / installment;
            if (installmentTotal < 1000) {
                break;
            }
            System.out.println("Installment " + installment + "U$ " + installmentTotal);
        }

    }
}
