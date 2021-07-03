package br.com.introduçãojava.javacore.introducaometodo.test;

import br.com.introduçãojava.javacore.introducaometodos.classe.Professora;

public class ProfessoraTest {
    public static void main(String[] args) {
        Professora prof = new Professora();
        prof.cpf = "012.013.014-15";
        prof.matricula = "21851581";
        prof.nome = "Marcia";
        prof.rg = "1004385-0";

        Professora prof2 = new Professora();
        prof2.cpf = "023.031.044-60";
        prof2.matricula = "21851581";
        prof2.nome = "Mariana";
        prof2.rg = "2004385-0";

        prof.imprime(prof);
        prof.imprime(prof2);

    }

}
