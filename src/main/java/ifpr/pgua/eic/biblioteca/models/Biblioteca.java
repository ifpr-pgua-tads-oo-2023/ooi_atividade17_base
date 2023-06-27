package ifpr.pgua.eic.biblioteca.models;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Autor> autores;

    public Biblioteca() {

    }

    public boolean cadastrarLivro(String titulo, String editora, int anoPublicacao, Autor autor) {
        return false;
    }

    public Livro buscarLivro(String titulo) {
        return null;
    }

    public boolean cadastrarAutor(String nome, String email) {
        return false;
    }

    public Autor buscarAutor(String nome) {
        return null;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public ArrayList<Livro> getLivroAutor(Autor autor) {
        return null;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return null;
    }

    public boolean emprestarLivro(Livro livro) {
        return false;
    }

    public boolean devolverLivro(Livro livro) {
        return false;
    }

}
