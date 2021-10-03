package POO.Guanabara.aula04;

import jdk.swing.interop.SwingInterOpUtils;

public class Caneta {
    public String modelo;
    private float ponta;
    boolean tampada;

    public void Caneta() { // Este é o método construtor

    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+ this.ponta);

    }

}
