package Aula06Encapsulamento;

public class ControleRemoto implements Controlador { //Implementar a interface
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    // Métodos Especiais

    public ControleRemoto () { // método constructor
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(0);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 1; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu ...");
    }

    @Override
    public void maisvolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 10);
        } else
            System.out.println("Impossível aumentar volume!");
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() - 10);
        } else
            System.out.println("Impossível diminuir volume!");
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }



}
