package model;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    ArrayList<Estudante> estudantes;
    private  Professor professor;
    private  ArrayList<notasAlunos> notasalunos;

    public Disciplina(String codigo, ArrayList<Estudante> estudantes, Professor professor, ArrayList<notasAlunos> notasalunos) {
        this.codigo = codigo;
        this.estudantes = estudantes;
        this.professor = professor;
        this.notasalunos = notasalunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<notasAlunos> getNotasalunos() {
        return notasalunos;
    }

    public void setNotasalunos(ArrayList<notasAlunos> notasalunos) {
        this.notasalunos = notasalunos;
    }

    public void adicionarEstudante(Estudante estudante){
    estudante.add(estudante);

    }

    public void removerEstudante(Estudante estudante){
        estudante.remove(estudante);

    }

    public void pesquisarEstudante(String nome, String codigo){

    }

    public void adicionarnotaAlunos(notasAlunos notasalunos){
        notasalunos.add(notasalunos);

    }

    public void removernotaAlunos(notasAlunos notasalunos){
        notasalunos.remove(notasalunos);

    }

    @Override
    public java.lang.String toString() {
        return "Disciplina{" +
                "codigo='" + codigo + '\'' +
                ", estudantes=" + estudantes +
                ", professor=" + professor +
                ", notasalunos=" + notasalunos +
                '}';
    }
}
