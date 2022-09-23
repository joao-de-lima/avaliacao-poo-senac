package br.com.fiap.pacman;

public class Player extends GameObject {

    // TODO construtor e os métodos sets devem ser validados
    private int direction;
    private int life;
    private boolean invencivel;

    public Player() {

    }

    public Player(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
        invencivel = false;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isInvencivel() {
        return invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        this.invencivel = invencivel;
    }

    private boolean movimentar(int x, int y, int direction) {
        boolean validacao = false;
        switch (direction) {
            case 0:
                validacao = getY() - y >= 0;
                break;
            case 180:
                validacao = getY() + y <= getScreenSize();
                break;
            case 270:
                validacao = getX() - x >= 0;
                break;
            case 90:
                validacao = getX() + x <= getScreenSize();
                break;

        }

        return validacao;
    }

    public void mover() {
        int x = getDirection() == 90 || getDirection() == 270 ? 10 : 0;
        int y = getDirection() == 180 || getDirection() == 0 ? 10 : 0;
        if (movimentar(x, y, getDirection())) {
            switch (getDirection()) {
                case 0:
                    setY(getY() - y);
                    break;
                case 180:
                    setY(getY() + y);
                    break;
                case 270:
                    setX(getX() - x);
                    break;
                case 90:
                    setX(getX() + x);
                    break;

            }

        }
    }

}
