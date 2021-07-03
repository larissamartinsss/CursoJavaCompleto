package br.com.introduçãojava.javacore.introducaometodos.classe;

public class Professora {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


    public void imprime(){
        System.out.println("-----------");
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg );

        //this é usado p/ pegar os valores dentro do proprio objeto;
    }
}
