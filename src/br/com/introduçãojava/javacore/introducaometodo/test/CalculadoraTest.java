package br.com.introduçãojava.javacore.introducaometodo.test;

import br.com.introduçãojava.javacore.introducaometodos.classe.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Continue");
        calc.subtraiDoisNumeros();
        System.out.println("Continue");
        calc.multiplicarDoisNumeros();
        System.out.println("Continue");
        // System.out.println(calc.divideDoisNumeros(20,2)); Ou:
        double resultado = calc.divideDoisNumeros(20,4);
        System.out.println(resultado);
        System.out.println("Printing two divide numbers");
        calc.imprimeDoisNumerosDivididos(20,0);
        System.out.println("Continue");

        int [] numeros = new int [] {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);



    }

}
