package edu.marcos.semana06.biblioteca;

public class Livro  {
    private Autor autor;
    private String titulo;
    private boolean disponivel;

    public Livro(Autor autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public void emprestar(){
        System.out.println("Emprestando..");
        this.disponivel = false;
    }
    public void devolver(){
        this.disponivel = true;
    }
    public boolean isDisponivel(){
        return this.disponivel;
    }
}
