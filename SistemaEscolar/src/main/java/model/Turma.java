package model;

import java.util.ArrayList;

//regra de negocio: nunca remover uma disciplina, mas posso remover um professor - a depender da lógica

public class Turma {
    private String nome;
    private String codigo;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professoares;
    private ArrayList<Estudante> estudantes;

    public Turma(String nome, String codigo, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professoares, ArrayList<Estudante> estudantes) {
        this.nome = nome;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
        this.professoares = professoares;
        this.estudantes = estudantes;
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

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Professor> getProfessoares() {
        return professoares;
    }

    public void setProfessoares(ArrayList<Professor> professoares) {
        this.professoares = professoares;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    @Override
    public java.lang.String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", disciplinas=" + disciplinas +
                ", professoares=" + professoares +
                ", estudantes=" + estudantes +
                '}';
    }
}
