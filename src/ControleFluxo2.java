public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 21;
         String status;
         /*if (idade < 18) {
             status = "Não adulto";
         } else {
             status = "adulto";
         }*/
        // operador ternario substui esse IF mais simples com até 2 instruções
        status = idade <18 ? "Não adulto" : "adulto";
        System.out.println(status);
    }

}
