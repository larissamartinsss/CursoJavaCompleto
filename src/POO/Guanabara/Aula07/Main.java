package POO.Guanabara.Aula07;

public class Main {
    public static void main(String[] args) {
        Lutadora l[] = new Lutadora[7];
        l[0] = new Lutadora("Cecilia", "Belgica", 31, 1.75,
                68.9, 11, 2 ,1 );
        l[1] = new Lutadora("Kate", "Estados Unidos", 28, 1.80,
                67.9, 9, 4 ,2 );
        l[2] = new Lutadora("Paola", "México", 31, 1.75, 76.9, 9, 4 ,2 );
        l[3] = new Lutadora("Jéssica", "Brasil", 26, 1.72, 77.3, 9, 4 ,2 );
        l[4] = new Lutadora("Cecilia", "Holanda", 25,1.75, 89.9, 9, 4 ,2 );
        l[5] = new Lutadora("Cecilia", "Chile", 31, 1.75, 78.9, 9, 4 ,2 );
        l[6] = new Lutadora("Cecilia", "Africa do sul", 32, 1.81, 90.4, 11,2, 2);


//        l[0].status();
//        l[1].status();
//        l[2].status();
//        l[3].status();
//        l[4].status();
//        l[5].status();
//        l[6].status();

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[1],l[5] );
        UFC01.lutar();
        l[0].status();
        l[1].status();


    }
}
