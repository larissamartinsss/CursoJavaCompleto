package POO.Guanabara.Aula06.ControleRemoto;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------- Menu --------");
        System.out.println("Está ligado? " +this.isLigado());
        System.out.println("Está tocando " + this.isTocando());
        System.out.println("Volume: "+ this.getVolume());
        for (int i = 0; i <=this.getVolume() ; i+=10) {
            System.out.print("|");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu ");
    }

    @Override
    public void maisVolume() {
        if(isLigado()){
            setVolume(getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado()){
            setVolume(getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if(isLigado() && getVolume() > 0){
            setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(false);
        }
    }
}
