package edu.marcos.semana10.Musica;




public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Musica> lista = new ListaDuplamenteEncadeada<>();

        PlataformaMusica plataformaMusica = new Soundcloud(lista);

        plataformaMusica.adicionarMusica();
        plataformaMusica.menuPlataforma(true);
        // TODO: Criar metodo to string nas classes filhas e simplificar codigo.



    }
}
