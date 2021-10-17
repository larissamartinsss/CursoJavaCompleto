package POO.Guanabara.Aula06.ControleRemoto;

public class ControleRemoto{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(int volume, double ligado, double tocando) {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return this.tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
