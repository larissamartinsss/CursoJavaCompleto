package POO.Guanabara.Aula05;

public class ContaBanco {
    public double numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    void abirConta(){
        this.status = true;
        if(this.tipo == "CC"){
            System.out.println("Parabéns! Você ganhou R$50,00!");
        }else{
            System.out.println("Parabéns! Você ganhou R$150,00!");
        }
        }

    void fecharConta(){
        this.status = false;
        if(this.saldo <0){
            System.out.println("Fechando conta!");
        }
    }

    void depositar(){
        this.status = true;

    }

    void sacar(){
    this.status = true;
    if(this.saldo > 0 && this.saldo <= 1.000){
        System.out.println("Sacando...");
    }
    }

    void pagarMensal(){
        this.status = true;
        if(this.tipo == "CC"){
            double desconto = this.saldo-12;
        }else{
            double desconto = this.saldo-20;
        }

    }
    // Getters and Setters:
    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

