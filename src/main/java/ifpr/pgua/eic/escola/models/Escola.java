package ifpr.pgua.eic.escola.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Escola {
    private String nome;
    private String telefone;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Curso> cursos;
    
    public Escola(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public boolean cadastrarAluno(String cpf, String nome, String email, String telefone){
        return false;
    }

    public Aluno buscarAlunoCpf(String cpf){
        return null;
    }

    public Aluno buscarAlunoEmail(String email){
        return null;
    }

    public boolean cadastrarProfessor(String cpf, String nome, String email, String telefone, double salario){
        return false;
    }

    public Professor buscarProfessorCpf(String cpf){
        return null;
    }

    public Professor buscarProfessorEmail(String email){
        return null;
    }

    public boolean cadastrarCurso(int codigo, String nome, int cargaHoraria, Professor professor){
        return false;
    }

    public Curso buscarCurso(int codigo){
        return null;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }


}
