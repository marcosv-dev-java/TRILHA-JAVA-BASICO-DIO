package edu.marcos.semana07.pilha;

public class PilhaHistorico {
    private PaginaWeb refNovaPaginaWeb;
    // É uma referencia privada, pronta pra quando criar uma nova página web

    public PilhaHistorico(){
        this.refNovaPaginaWeb = null;
    }
    public boolean isEmpty(){
        return refNovaPaginaWeb == null ? true : false; // Se a referencia da nova página estiver vazio, retorna true, se não, false
    }
    public void novaPagina(PaginaWeb novaPaginaWeb){ // Metodo top, recebe como parametro uma pagina web que precisa ter uma url
        PaginaWeb auxiliarNovaPagina = refNovaPaginaWeb;
        // Criamos um objeto para salvar a referencia que estava apontando para o topo
        refNovaPaginaWeb = novaPaginaWeb;
        // Fazemos uma ligação dos 2 objetos, passando a ser a nova pagina web, ou seja atualizamos o topo
        novaPaginaWeb.setProximaPagina(auxiliarNovaPagina);
        // Setamos a proxima pagina para referencia que fica aguardando a nova página, ele agora tá apontando para o topo antigo
    }

    public PaginaWeb removerPagina(){
        if(!this.isEmpty()){ // Se a referencia desse objeto não estiver vazio o código roda.

            PaginaWeb paginaRemovida = refNovaPaginaWeb;
            // Salvamos a página que vai ser removida
            refNovaPaginaWeb = refNovaPaginaWeb.getProximaPagina();
            // A referencia que tava apontando para o topo agora esqueceu o topo e apontou pra proxima pagina, ou seja removemos o topo
            return paginaRemovida;
            // Embora a pagina seja removida retornamos ela pra caso vá precisar usar
        }
        return null; // se a condição do if não for verdadeira, retorna nulo pq tá vazio
    }
    public PaginaWeb ultimaPagina(){
        return this.refNovaPaginaWeb; // Retorna a referencia que aponta pra ultima pagina, ou seja a ultima pagina
    }

    public String toString(){
        /* Em java se você for imprimir um objeto
         ele busca um método proprio dele chamado to string, se você não definir o método
         quando você for printar um objeto ele provavelmente vai sair algo como PilhaHistorico@34123adadwa e uns negocio assim
         porem, se você criar sua própria, o java ja reconhece a sua e quando for printar o objeto já vem esse metodo mesmo sem chamar

        */
        String stringRetorno = "____________________________________________\n";
        stringRetorno +=       "                   Historico                    \n";
        stringRetorno +=       "____________________________________________\n";
        PaginaWeb auxiliarPagina = refNovaPaginaWeb;
        while(true){
            if(auxiliarPagina != null){
                stringRetorno += "[Página{URL= "+auxiliarPagina.getUrl()+"}]\n";
                stringRetorno += "[Página{Web="+auxiliarPagina.getPaginaWeb()+"}]\n";
                auxiliarPagina = auxiliarPagina.getProximaPagina();
            } else break;
            stringRetorno +=  "____________________________________________\n";
        }
        return stringRetorno;

    }

}