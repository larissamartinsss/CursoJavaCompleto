package br.com.introduçãojava.controlefluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte day = 7;
        // switch just work if there is a char, int, byte, short, enum and string
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

        }
        String sex = "FF";
        switch (sex) {
            case "F":
                System.out.println("Feminine");
                break;
            case "M":
                System.out.println("Masculine");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
