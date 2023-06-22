package universidade;

import java.util.ArrayList;
import java.lang.System;
import static java.lang.System.exit;

public class Turma {
    private final int MIN_ALUNOS = 5;
    private final int MAX_ALUNOS = 35;
    private final int MIN_MONITORES = 0;
    private final int MAX_MONITORES = 3;
    private int numAlunos;
    private int numMonitores;
    private Professor professor;
    private ArrayList<Monitor> monitores;
    private ArrayList<Aluno> alunos;

    public Turma(Professor prof, ArrayList<Monitor> listaMonitores, ArrayList<Aluno> listaAlunos) {
        this.professor = prof;
        /*
        if(listaMonitores.size() < MIN_MONITORES || listaMonitores.size() > MAX_MONITORES) {
            System.out.println("O número de monitores deve ser: 0 <= numMonitores <= 3");
            exit(0);
        }
        */
        this.monitores = listaMonitores;
        /*
        if(listaAlunos.size() < MIN_ALUNOS || listaAlunos.size() > MAX_ALUNOS) {
            System.out.println("O número de alunos deve ser: 5 <= numAlunos <= 35");
            exit(0);
        }
        */
        this.alunos = listaAlunos;
    }

    public Turma() {}
    public int getNumAlunos() {
        return numAlunos;
    }
    public int getNumMonitores() {
        return numMonitores;
    }
    public void setProfessor(Professor prof) {
        this.professor = prof;
    }
    public void setMonitores(ArrayList<Monitor> listaMonitores) {
        /*
        if(listaMonitores.size() < MIN_MONITORES || listaMonitores.size() > MAX_MONITORES) {
            System.out.println("O número de monitores deve ser: 0 <= numMonitores <= 3");
            exit(0);
        }
        */
        this.monitores = listaMonitores;
    }
    public void setAlunos(ArrayList<Aluno> listaAlunos) {
        /*
        if(listaAlunos.size() < MIN_ALUNOS || listaAlunos.size() > MAX_ALUNOS) {
            System.out.println("O número de alunos deve ser: 5 <= numAlunos <= 35");
            exit(0);
        }
        */
        this.alunos = listaAlunos;
    }
    public void adicionaAluno(Aluno newAluno) {
        /*
        if(this.numAlunos + 1 < 5 || this.numAlunos + 1 > 35) {
            System.out.println("O número de alunos deve ser: 5 <= numAlunos <= 35");
            exit(0);
        }
        */
        this.numAlunos++;
        this.alunos.add(newAluno);
    }
    public void removeAluno() {
        /*
        if(this.numAlunos - 1 < 5 || this.numAlunos - 1 > 35) {
            System.out.println("O número de alunos deve ser: 5 <= numAlunos <= 35");
            exit(0);
        }
        */
        this.numAlunos--;
        this.alunos.remove(this.alunos.size() - 1);
    }
    public void imprimeAlunos() {
        for (Aluno aluno : alunos)
            aluno.imprime();
    }
}
