package br.com.introduçãojava.javacore.introducaoclassestest;

import br.com.introduçãojava.javacore.introducaoclasses.Professora;

public class ProfessoraTest {
    public static void main(String[] args) {
        Professora larissa = new Professora();
        larissa.nome = "Larissa";
        larissa.matricula = "21851581";
        larissa.cpf = "022.222.333-33";
        larissa.rg = "300200-1";
        System.out.println("------ Cadastro de professores-----------");
        System.out.println("Professora titular: "+larissa.nome +" Souza");
        System.out.println("Matricula " +larissa.matricula);
        System.out.println("CPF "+larissa.cpf);
        System.out.println("RG: " +larissa.rg);

        System.out.println("---------------------------------------");

        Professora leticia = new Professora();
        leticia.nome = "Leticia";
        leticia.matricula = "210101010-A";
        leticia.cpf = "011.323.222-00";
        leticia.rg = "808080-8";

        System.out.println("Professora substituta: " +leticia.nome + " Silva");
        System.out.println("Matricula: "+leticia.matricula);
        System.out.println("CPF: " +leticia.cpf);
        System.out.println("RG: " + leticia.rg);




    }
}
