package edu.marcos.semana06.biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo = new ArrayList<>();



    public void adicionarLivro(Livro livro){
        acervo.add(livro);
    }
    public void mostrarLivrosDisponiveis(){
        for(Livro l : acervo){
            if (l.isDisponivel()) {
                System.out.println("Título: " + l.getTitulo());
                System.out.println("Autor: "+l.getAutor());
            }
        }
    }
}
