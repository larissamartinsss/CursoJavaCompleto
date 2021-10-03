package POO.Guanabara.Aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo, v;
    private boolean status;

    void abirConta(String t){
        setTipo(t);
        setStatus(true);

        this.status = true;
        if(t == "CC"){
            System.out.println("Parabéns! Você ganhou R$50,00!");
            saldo = 50;
        }else{
            System.out.println("Parabéns! Você ganhou R$150,00!");
            saldo = 150;
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

    void depositar(){
        if(this.status = true){
            setSaldo(getSaldo() +v);
        }else{
            System.out.println("Impossivel depositar! ");
        }

    }

    void sacar(){
    if(this.status = true) {
        if (getSaldo() > v) {
            saldo = saldo - v;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }else
        System.out.println("Impossivel sacar!  ");
        }


    void pagarMensal() {
        double v = 0;
        if (this.tipo == "CC") {
            v = 12;
        }
        else if (this.tipo == "CP"){
                v = 20;
            }
        if(status = true){
            if(saldo > v){
                saldo = saldo - v;
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Impossivel pagar!");
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

