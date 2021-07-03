package br.com.introduçãojava.javacore.introducaometodos.classe;

public class ExercicioMetodos {
    private String nome;
    private int idade;
    private double[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas != null)
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Esse estudante não possui notas");
            return;
        }

        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media >= 6) {
            System.out.println("\n A média é: " + media + " Situação: Aprovado");

        } else {

            System.out.println("\n Reprovado");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

}
