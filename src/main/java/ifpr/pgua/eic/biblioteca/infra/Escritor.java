package ifpr.pgua.eic.biblioteca.infra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import ifpr.pgua.eic.biblioteca.models.Autor;
import ifpr.pgua.eic.biblioteca.models.Livro;

public class Escritor {
    
    

    public boolean salvarLivros(String nomeArquivo,ArrayList<Livro> lista){
        throw new RuntimeException("TODO");
    }

    public boolean salvarAutores(String nomeArquivo,ArrayList<Autor> lista){
        throw new RuntimeException("TODO");
    }

}
