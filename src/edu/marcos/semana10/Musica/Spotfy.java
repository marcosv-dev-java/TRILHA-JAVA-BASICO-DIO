package edu.marcos.semana10.Musica;

public class Spotfy extends PlataformaMusica{


    public Spotfy(ListaDuplamenteEncadeada<Musica> lista) {
        super(lista);
    }


    public String getTitulo() {
        return "Spotfy";
    }


    public void menuPlataforma(boolean listarMusica) {
        super.menuPlataforma(listarMusica);
    }


}
