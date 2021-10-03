package POO.Guanabara.Aula05;

public class ContaBanco {
    private double numConta;
    private String tipo;
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

    }

    void sacar(){

    }

    void pagarMensal(){

    }
}

