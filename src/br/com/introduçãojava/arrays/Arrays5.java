package br.com.introduçãojava.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        // Arrays bidimensionais
        int[][] days = new int[2][2];
        days[0][0] = 30;
        days[0][1] = 29;
        days[1][0] = 28;
        days[1][1] = 29;

        for (int i = 0; i<days.length;i++){
            System.out.println(days[i]);
            for(int j = 0; j< days[i].length; j++){
                System.out.println(days[i] [j]);
            }
        }
        System.out.println("--------------------");
        for (int[] ref : days){
            for (int day : ref ){
                System.out.println(day);
            }
        }
    }
}