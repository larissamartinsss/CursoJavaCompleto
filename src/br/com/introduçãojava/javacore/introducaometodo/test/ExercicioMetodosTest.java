package br.com.introduçãojava.javacore.introducaometodo.test;

import br.com.introduçãojava.javacore.introducaometodos.classe.ExercicioMetodos;

public class ExercicioMetodosTest {
    public static void main(String[] args) {
        ExercicioMetodos estudante = new ExercicioMetodos();
        estudante.setNome("Larissa Martins");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{3, 2, 9, 8});
        estudante.print();
        estudante.tirarMedia();
        System.out.println("Aprovado? " + estudante.isAprovado());


    }
}