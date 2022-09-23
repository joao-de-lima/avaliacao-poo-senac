package br.com.fiap.pacman;

import java.util.Random;

// TODO construtor e os métodos sets devem ser validados
public class Ghost extends GameObject {

    private int direction;

    public Ghost() {

    }

    public Ghost(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
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

        int[] direcoes = { 0, 90, 180, 270 };
        Random aleatorio = new Random();
        setDirection(direcoes[aleatorio.nextInt((3 - 0) + 1) + 0]);
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
