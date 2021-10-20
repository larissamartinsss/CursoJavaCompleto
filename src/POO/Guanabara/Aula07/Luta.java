package POO.Guanabara.Aula07;

import java.util.Random;

public class Luta {
    private Lutadora desafiada;
    private Lutadora desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutadora l1, Lutadora l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 !=l2){
            this.aprovada = true;
            this.desafiada = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiada = null;
            this.desafiante = null;
        }


    }
    public void lutar(){
        if(isAprovada()){
            System.out.println("###### DESAFIADA ######");
            desafiada.apresentar();
            System.out.println("###### DESAFIANTE ######");
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("======== RESULTADO DA LUTA ========");
            switch (vencedor) {
                case 0: // empate
                    System.out.println("Empatou!");
                    desafiada.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória da: "+desafiada.getNome());
                    desafiada.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Derrota da: "+desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiada.perderLuta();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


        }else {
            System.out.println("A luta não pode acontecer");
        }


    }

    public Lutadora getDesafiada() {
        return desafiada;
    }

    public void setDesafiada(Lutadora desafiada) {
        this.desafiada = desafiada;
    }

    public Lutadora getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadora desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

