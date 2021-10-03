package br.com.introduçãojava.javacore.introducaometodo.test;

import br.com.introduçãojava.javacore.introducao.metodo.Calculadora1;

public class Calculadora1Test {
    public static void main(String[] args) {
        Calculadora1 calculadora = new Calculadora1();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calc teste");
        calculadora.subtrairDoisNumeros();


    }
}
