package ifpr.pgua.eic.escola.infra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import ifpr.pgua.eic.escola.models.Aluno;
import ifpr.pgua.eic.escola.models.Curso;
import ifpr.pgua.eic.escola.models.Professor;

public class Escritor {
    
    

    public boolean salvarAlunos(String nomeArquivo,ArrayList<Aluno> lista){
        throw new RuntimeException("TODO");
    }

    public boolean salvarProfessores(String nomeArquivo,ArrayList<Professor> lista){
        throw new RuntimeException("TODO");
    }

    public boolean salvarCursos(String nomeArquivo,ArrayList<Curso> lista){
        throw new RuntimeException("TODO");
    }
}
