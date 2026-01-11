package edu.marcos.semana07.pilha;

public class PaginaWeb {
    private String url;
    private String paginaWeb;
    private PaginaWeb proximaPagina = null;
    // Quando criar uma página web ela precisa receber uma url como parametro e a proxima pagina começa como nulo

    public PaginaWeb(String url, String paginaWeb) {
        this.url = url;
        this.paginaWeb = paginaWeb;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PaginaWeb getProximaPagina() {
        return proximaPagina;
    }

    public void setProximaPagina(PaginaWeb proximaPagina) {
        this.proximaPagina = proximaPagina;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
}
