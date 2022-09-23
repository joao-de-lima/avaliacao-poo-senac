package br.com.fiap.pacman;

// TODO construtor e métodos sets devem ser validados
public class Booster extends Item {

    private int duracao;

    public Booster() {

    }

    public Booster(int x, int y, int duracao) {
        super(x, y);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

}
