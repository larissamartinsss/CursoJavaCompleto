public class Arrays2 {
    public static void main(String[] args) {
        //valores padrões de inicialização arrays:
        // byte, short, int, long, float, double = 0;
        // char '\u0000' ' ' '
        // boolean false;
        // reference, String null;
        String[] nomes = new String[3];
        System.out.println(nomes.length);
        nomes[0] = "Larissa ";
        nomes[1] = " Martins";
        nomes[2] = " De Souza";
        // metodo for sem a propriedade length:
        //for (int i=0; i<3; i++) {
        //System.out.println(nomes[i]);

        // metodo for com a propriedade length:
            for (int i=0; i<nomes.length; i++) {
                System.out.println(nomes[i]);
        }
        // Metodo mais simples e demorado:
        // System.out.println("Meu nome completo é "+ nomes[0] + nomes[1] + nomes[2]);


    }
}