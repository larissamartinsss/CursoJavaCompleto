package br.com.introduçãojava.javacore.introducaometodos.classe;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 1);
    }

    public void multiplicarDoisNumeros() {
        System.out.println(5 * 5);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
            return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 !=0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Is not possible divide by 0");
    }

}
