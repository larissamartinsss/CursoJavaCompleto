package POO.Guanabara.Aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura,
                   double peso, int vitorias, int derrotas, int empates)
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
    }

    public void status(){
    }
    public void ganharLuta(){
    }
    public void perderLuta(){
    }
    public void empatarLuta(){
    }
}

