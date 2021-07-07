package br.com.introduçãojava.javacore.sobrecargasmetodos.test;

import br.com.introduçãojava.javacore.sobrecargasmetodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Larissa Martins", "034056966-44", 4500,
                "30054060");
        funcionario.imprime();
    }
}

