package br.com.introduçãojava.javacore.introducaometodos.classe;

public class Professora {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


    public void imprime(Professora aux){
        System.out.println("-----------");
        System.out.println(aux.cpf);
        System.out.println(aux.matricula);
        System.out.println(aux.nome);
        System.out.println(aux.rg);
    }
}
