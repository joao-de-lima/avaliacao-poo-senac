package br.com.fiap.pacman;

// TODO construtor e os métodos sets devem ser validados

public class Item extends GameObject {
    
    private boolean visivel;

    public Item() {

    }

    public Item(int x, int y) {
        super(x, y);
        visivel = true;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    

}
