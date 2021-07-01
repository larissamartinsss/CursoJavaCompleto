package br.com.introduçãojava.javacore.introducaoclassestest;

import br.com.introduçãojava.javacore.introducaoclasses.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "Jõao";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);


    }
}
