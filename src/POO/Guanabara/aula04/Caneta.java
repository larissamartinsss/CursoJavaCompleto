package POO.Guanabara.aula04;

import jdk.swing.interop.SwingInterOpUtils;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    boolean tampada;


    public Caneta(String m, String c, float p) { // Este é o método construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();

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