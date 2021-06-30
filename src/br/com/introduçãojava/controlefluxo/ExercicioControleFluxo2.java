package br.com.introduçãojava.controlefluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        int dayOfWeek = 1;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Today is Sunday, weekend!");
                break;
            case 2:
                System.out.println("Today is Monday, workday!");
                break;
            case 3:
                System.out.println("Today is tuesday, workday!");
                break;
            case 4:
                System.out.println("Today is Wednesday, workday!");
                break;
            case 5:
                System.out.println("Today is Thursday, workday!");
                break;
            case 6:
                System.out.println("Today is Friday, workday!");
                break;
            case 7:
                System.out.println("Today is Saturday, weekend!");
                break;
            default:
                System.out.println("Invalid option");
        }  // doing the same with another way! Just to see if is a work or week day!
        byte day = 7;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend!");
                break;
            case 2:
            case 6:
                System.out.println("Workday!");
                break;
            default:
                System.out.println("Invalid Option!");
        }
    }
}
