package POO.Guanabara.aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Preto", 0.4f);
        c1.status();
        System.out.println("\n Caneta 2: \n");
        Caneta c2 = new Caneta("FabCastel", "Vermelho", 0.3f);
        c2.status();
    }
}
