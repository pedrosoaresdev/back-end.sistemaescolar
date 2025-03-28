package model;

import java.util.Arraylist;

public class Estudante extends caracteregeral {
    private Turma turma;
    private ArrayList<Disciplina> disciplinas;


    public  Estudante(String nome, String id, Turma turma, ArrayList<Disciplina> disciplinas){
        super(nome, id);
        this.turma = turma;
        this.disciplinas = disciplinas;
    }

    public Estudante(String nome, String codigo){
        super(nome, codigo);
    }


    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Estudante{" +
                "turma=" + turma +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
