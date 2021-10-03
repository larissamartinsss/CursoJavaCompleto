package br.com.introduçãojava.javacore.introducaoclasses.DominioTest;

import br.com.introduçãojava.javacore.introducaoclasses.dominio.Pessoa1;

public class Pessoatest2 {
    public static void main(String[] args) {
      Pessoa1 estudante = new Pessoa1();
      Pessoa1 estudante2 = new Pessoa1();

      estudante.nome ="Luan";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("-------------------------------");
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);


    }
}
