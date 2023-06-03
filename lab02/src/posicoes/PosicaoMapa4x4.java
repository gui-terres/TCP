package posicoes;

import java.util.ArrayList;

public class PosicaoMapa4x4 {
    private int x;
    private int y;
    private static int numPosicoesOcupadas;

    public PosicaoMapa4x4() {
        reset();
    }

    public PosicaoMapa4x4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void reset() {
        this.x = 0;
        this.y = 0;
    }

    public boolean setX(int x) {
        if (x >= 0 && x < 4) {
            this.x = x;
            return true;
        }
        this.reset();
        return false;
    }

    public int getX() {
        return this.x;
    }

    public boolean setY(int y) {
        if (y >= 0 && y < 4) {
            this.y = y;
            return true;
        }
        this.reset();
        return false;
    }

    public int getY() {
        return this.y;
    }

    public static int getNumPosicoesOcupadas() {
        return numPosicoesOcupadas;
    }

    public PosicaoMapa4x4 copy() {
        return new PosicaoMapa4x4(this.x, this.y);
    }

    public void imprime() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    public int distancia(PosicaoMapa4x4 p) {
        return (Math.abs(this.x - p.x) + Math.abs(this.y - p.y));
    }

    public static boolean estaoMesmaPosicao(PosicaoMapa4x4 p1, PosicaoMapa4x4 p2) {
        if (p1.x == p2.x && p1.y == p2.y)
            return true;
        return false;
    }

    public static void imprimeMapa(ArrayList<PosicaoMapa4x4> mapa) {
        char[][] matriz = new char[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = '-';
        }

        for (int i = 0; i < mapa.size(); i++) {
            int x = mapa.get(i).x;
            int y = mapa.get(i).y;
            matriz[y][x] = 'X';
        }

        System.out.println("Mapa:");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = 0; j < matriz[i].length; j++)
                System.out.print(matriz[i][j]);
            System.out.print('\n');
        }

    }
}

/*
* System.out.printf("Imprimindo p%d:\n", i);
            System.out.printf("p%d.x = %d\n", i, mapa.get(i).x);
            System.out.printf("p%d.y = %d\n", i, mapa.get(i).y);
*
* */
