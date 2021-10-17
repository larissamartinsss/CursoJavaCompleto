package POO.Guanabara.Aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private double v;
    private boolean status;

    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("--------------------------------");
    }

    void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        this.status = true;
        if(t == "CC"){
            System.out.println("Parabéns! Você ganhou R$50,00!");
            this.setSaldo(50);
        }else{
            System.out.println("Parabéns! Você ganhou R$150,00!");
            this.setSaldo(150);
        }
        }

    void fecharConta(){
        this.status = false;
        if(this.saldo >0){
            System.out.println("Conta com dinheiro!");
        } else if(saldo < 0){
            System.out.println("Conta em débito!");
        } else{
            System.out.println("Fechando conta");
            setStatus(false);
        }
    }

    void depositar(int v){
        if(this.getStatus()){
            this.saldo = this.saldo + v;
            this.setSaldo(saldo);
            System.out.println("Depósito realizado na conta de: "+this.getDono());
        }else{
            System.out.println("Impossivel depositar! ");
        }

    }

    void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: "+this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossivel sacar! Saldo insuficiente ");
        }
    }


    void pagarMensal() {
        double v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        }
        else if (this.getTipo() == "CP"){
                v = 20;
            }
        if(getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
        }
            else{
                System.out.println("Impossivel pagar uma conta fechada! ");
             }
    }

    public ContaBanco() {
        saldo = 0;
        status = false;

    }

    // Getters and Setters:
    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
}

