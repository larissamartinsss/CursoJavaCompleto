package POO.Guanabara.Aula07;

public class Main {
    public static void main(String[] args) {
        Lutadora l[] = new Lutadora[7];
        l[0] = new Lutadora("Cecilia", "Belgica", 31, 1.75,
                68.9, 11, 2 ,1 );
        l[1] = new Lutadora("Kate", "Estados Unidos", 28, 1.80,
                78.9, 9, 4 ,2 );
        l[2] = new Lutadora("Paola", "México", 31, 1.75, 78.9, 9, 4 ,2 );
        l[3] = new Lutadora("Jéssica", "Brasil", 26, 1.72, 78.9, 9, 4 ,2 );
        l[4] = new Lutadora("Cecilia", "Holanda", 25,1.75, 78.9, 9, 4 ,2 );
        l[5] = new Lutadora("Cecilia", "Chile", 31, 1.75, 78.9, 9, 4 ,2 );
        l[6] = new Lutadora("Cecilia", "Africa do sul", 32, 1.81, 90.9, 11,2, 2);


        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        l[4].status();
        l[5].status();
        l[6].status();


    }
}
