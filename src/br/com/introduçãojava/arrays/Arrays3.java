package br.com.introduçãojava.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        // todas as formas de inicar um array:
        int[] numeros = new int[5];
        int [] numeros2 = {1,2,3,4,5}; // tam =5, index = o até 4;
        int [] numeros3 = new int [] {1,2,3,4,5};

//        for (int i =0 ; i<numeros2.length; i++){
//            System.out.println(numeros2[i]);
//        }
        // for each observar qual o tipo da var
        for (int num : numeros){
            System.out.println(num);
        }
    }
}
