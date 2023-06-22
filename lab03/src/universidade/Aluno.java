package universidade;

import static java.lang.System.exit;

public class Aluno {
    private final int MIN_DESEMPENHO = 0;
    private final int MAX_DESEMPENHO = 10;
    private int numeroMatricula;
    private float indiceDesempenho;

    public Aluno(int matricula, float desempenho) {
        this.numeroMatricula = matricula;
        if(desempenho < 0 || desempenho > 10) {
            System.out.println("O índice de desempenho deve estar entre 0 e 10");
            exit(0);
        }
        this.indiceDesempenho = desempenho;
    }

    public Aluno() {}

    public void aumentaIndiceDesempenho(float aumentoIndice) {
        if (this.indiceDesempenho + aumentoIndice > 10 || this.indiceDesempenho + aumentoIndice > 10) {
            System.out.println("O índice de desempenho deve estar entre 0 e 10");
            exit(0);
        }
        this.indiceDesempenho += aumentoIndice;
    }

    public void diminuiIndiceDesempenho(float diminuicaoIndice) {
        if (this.indiceDesempenho + diminuicaoIndice > 10 || this.indiceDesempenho + diminuicaoIndice > 10) {
            System.out.println("O índice de desempenho deve estar entre 0 e 10");
            exit(0);
        }
        this.indiceDesempenho -= diminuicaoIndice;
    }

    public void imprime() {
        System.out.print("\n");
        System.out.println("Número de matrícula: " + numeroMatricula);
        System.out.println("índice de desempenho: " + indiceDesempenho);
        System.out.print("\n");
    }
}
