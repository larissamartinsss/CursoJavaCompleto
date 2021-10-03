package br.com.introduçãojava.javacore.introducaoclasses.DominioTest;

import br.com.introduçãojava.javacore.introducaoclasses.dominio.Pessoa1;

public class Pessoa1Test {
    public static void main(String[] args) {
        Pessoa1 estudante = new Pessoa1();
        estudante.nome = "Larissa";
        estudante.idade = 21;
        estudante.sexo = 'F';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }
}
