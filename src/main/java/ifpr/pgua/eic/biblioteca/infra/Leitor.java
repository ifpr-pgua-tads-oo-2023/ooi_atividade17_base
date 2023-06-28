package ifpr.pgua.eic.biblioteca.infra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import ifpr.pgua.eic.biblioteca.models.Autor;
import ifpr.pgua.eic.biblioteca.models.Livro;

public class Leitor {

    /*O lista de autores é necessária para permitir buscar o autor do livro */
    public ArrayList<Livro> lerLivros(String nomeArquivo, ArrayList<Autor> listaAutores){
        throw new RuntimeException("TODO");
    }

    public ArrayList<Autor> lerAutores(String nomeArquivo){
        throw new RuntimeException("TODO");
    }

}
