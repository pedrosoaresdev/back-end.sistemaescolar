package model;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String codigo;
    private ArrayList<Turma> turmas;
    private ArrayList<Estudante> estudantes;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<notasAlunos> notasalunos;

    public Escola(String nome, String codigo, ArrayList<Turma> turmas, ArrayList<Estudante> estudantes, ArrayList<Professor> professores, ArrayList<notasAlunos> notasalunos, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.codigo = codigo;
        this.turmas = turmas;
        this.estudantes = estudantes;
        this.professores = professores;
        this.notasalunos = notasalunos;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<notasAlunos> getNotasalunos() {
        return notasalunos;
    }

    public void setNotasalunos(ArrayList<notasAlunos> notasalunos) {
        this.notasalunos = notasalunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    @Override
    public java.lang.String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", turmas=" + turmas +
                ", estudantes=" + estudantes +
                ", professores=" + professores +
                ", disciplinas=" + disciplinas +
                ", notasalunos=" + notasalunos +
                '}';
    }
}
