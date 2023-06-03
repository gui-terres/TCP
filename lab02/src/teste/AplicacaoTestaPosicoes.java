package teste;

import posicoes.PosicaoMapa4x4;
import java.util.Scanner;
import java.util.ArrayList;

public class AplicacaoTestaPosicoes {
    private int MAP_WIDTH;
    private int MAP_HEIGHT;

    public static void main(String[] args) {
        // Parte 3
        PosicaoMapa4x4 p1 = new PosicaoMapa4x4();
        Scanner reader = new Scanner(System.in);

        int userX, userY;
        do {
            System.out.print("Informe o valor de x (>= 0 e < 4): ");
            userX = reader.nextInt();
            System.out.print("Informe o valor de y ((>= 0 e < 4)): ");
            userY = reader.nextInt();
        } while (!(p1.setX(userX) && p1.setY(userY)));
        p1.imprime();

        // ========
        PosicaoMapa4x4 p2 = new PosicaoMapa4x4();

        do {
            System.out.print("Informe o valor de x (>= 0 e < 4): ");
            userX = reader.nextInt();
            System.out.print("Informe o valor de y ((>= 0 e < 4)): ");
            userY = reader.nextInt();
        } while (!(p2.setX(userX) && p2.setY(userY)));
        p2.imprime();

        System.out.println("Distância entre p1 e p2: " + p1.distancia(p2));

        // ========
        PosicaoMapa4x4 p3 = new PosicaoMapa4x4();
        p3 = p1.copy();

        System.out.println("p1 e p2 estão na mesma posição? " + (PosicaoMapa4x4.estaoMesmaPosicao(p1, p2) ? "Sim" : "Não"));
        System.out.println("p2 e p3 estão na mesma posição? " + (PosicaoMapa4x4.estaoMesmaPosicao(p2, p3) ? "Sim" : "Não"));
        System.out.println("p1 e p3 estão na mesma posição? " + (PosicaoMapa4x4.estaoMesmaPosicao(p1, p3) ? "Sim" : "Não"));

        ArrayList<PosicaoMapa4x4> posicoes = new ArrayList<PosicaoMapa4x4>();
        posicoes.add(p1);
        posicoes.add(p2);
        posicoes.add(p3);

        PosicaoMapa4x4.imprimeMapa(posicoes);

        reader.close();
    }
}
