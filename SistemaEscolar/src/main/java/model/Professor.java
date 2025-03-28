package model;

import  java.util.ArrayList;

public class Professor extends caracteregeral {
    private ArrayList<Turma> trumas;
    private Disciplina disciplina;

    public Professor(String none, String id, ArrayList<Turma> turmas, Disciplina disciplina) {
        super(nome, id);
        this.turmas = turmas;
        this.disciplina = disciplinas;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Turma> getTrumas() {
        return trumas;
    }


    @Override
    public java.lang.String toString() {
        return "Professor{" +
                "trumas=" + trumas +
                ", disciplina=" + disciplina +
                '}';
    }
}
