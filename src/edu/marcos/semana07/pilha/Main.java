package edu.marcos.semana07.pilha;
public class Main {
    public static void main(String[] args) {
        PilhaHistorico pilhaHistorico = new PilhaHistorico();
        pilhaHistorico.novaPagina(new PaginaWeb("https://euComoMerda.com.br","Wikipedia"));
        pilhaHistorico.novaPagina(new PaginaWeb("https://euComoMerda.com.br","Roblox"));
        System.out.println(pilhaHistorico);

        pilhaHistorico.removerPagina();
        System.out.println(pilhaHistorico);

    }

}
