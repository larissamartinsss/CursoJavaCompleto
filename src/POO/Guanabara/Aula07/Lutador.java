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
// Construtor
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

    // Metodos especiais:

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if(getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(getPeso() <=70.3){
            this.categoria = "Leve";
        }else if(getPeso() <=83.9){
            this.categoria = "Médio";
        }else if(getPeso() <=120.2){
            this.categoria = "Pesado";
        }else{
            System.out.println("Inválido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

