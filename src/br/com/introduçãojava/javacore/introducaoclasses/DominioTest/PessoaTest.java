package br.com.introduçãojava.javacore.introducaoclasses.DominioTest;

import br.com.introduçãojava.javacore.introducaoclasses.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Larissa";
        //pessoa.idade = 21;
        pessoa.setNome("Larissa");
        pessoa.setIdade(21);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
    }
}
