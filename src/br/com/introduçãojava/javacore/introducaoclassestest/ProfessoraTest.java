package br.com.introduçãojava.javacore.introducaoclassestest;

import br.com.introduçãojava.javacore.introducaoclasses.Professora;

public class ProfessoraTest {
    public static void main(String[] args) {
        Professora larissa = new Professora();
        larissa.nome = "Larissa";
        larissa.matricula = "21851581";
        larissa.cpf = "022.222.333-33";
        larissa.rg = "300200-1";

        System.out.println("Professora titular: "+larissa.nome +" Souza");
        System.out.println("Matricula " +larissa.matricula);
        System.out.println("CPF "+larissa.cpf);
        System.out.println("RG: " +larissa.rg);

        System.out.println("---------------------------------------");

        Professora raynara = new Professora();
        raynara.nome = "Raynara";
        raynara.matricula = "210101010-A";
        raynara.cpf = "011.323.222-00";
        raynara.rg = "808080-8";

        System.out.println("Professora substituta: " +raynara.nome + " Silva");
        System.out.println("Matricula: "+raynara.matricula);
        System.out.println("CPF: " +raynara.cpf);
        System.out.println("RG: " + raynara.rg);




    }
}
