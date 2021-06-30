package br.com.introduçãojava.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int counter = 11;
        while(counter <10){
            System.out.println(++counter);
        }
        counter = 0;
        do{
            System.out.println("Inside DoWhile"+counter++);
        }while (counter <10);

        for(int i=0; i<10; i++){
            System.out.println("The value of i is: "+i);
            if(i==5) {
                break;
            }
        }
    }
}
