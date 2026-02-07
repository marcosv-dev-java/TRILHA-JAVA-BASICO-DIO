package edu.marcos.semana10.Musica;

public class SoundCloud extends PlataformaMusica{

    public SoundCloud(ListaDuplamenteEncadeada<Musica> lista) {
        super(lista);
    }

    @Override
    public String getTitulo() {
        return "Spotfy";
    }

    public void menuPlataforma(boolean listarMusica) {
        super.menuPlataforma(listarMusica);
    }
}
