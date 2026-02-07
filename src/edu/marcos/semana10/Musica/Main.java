package edu.marcos.semana10.Musica;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Musica> lista = new ListaDuplamenteEncadeada<>();
        PlataformaMusica plataformaAtual;
        Scanner sc = new Scanner(System.in);

        System.out.println("Boas vindas ao player de música");

        int opcao = 0;

        while (opcao != 1 && opcao != 2){
            System.out.println("Escolha uma opção: ");
            System.out.print("""
                    1 - SoundCloud
                    2 - Spotfy
                    
                    Digite sua opção:""");

            opcao = sc.nextInt();
            sc.nextLine();

        }
        if (opcao == 1){
            plataformaAtual = new SoundCloud(lista);
        }
        else {
            plataformaAtual = new Spotfy(lista);
        }
        plataformaAtual.menuPlataforma(false);

        while (opcao != 6){
            System.out.println("O que deseja fazer?");
            System.out.println("""
                    1 - Cadastrar musica
                    2 - Remover musica
                    3 - Tocar musica
                    4 - Pular musica
                    5 - Voltar musica
                    6 - Sair""");

            opcao = sc.nextInt();
            if (opcao == 1){
                plataformaAtual.cadastrarMusica();
            }
            else if (opcao == 2){
                plataformaAtual.menuPlataforma(true);
                System.out.println("Deseja remover de qual indice?");
                int index = sc.nextInt();
                plataformaAtual.removerMusica(index);
            }
            else if  (opcao == 3){
                plataformaAtual.menuPlataforma(true);
                System.out.println("Deseja tocar de qual indice?");
                int index = sc.nextInt();
                plataformaAtual.tocarMusica(index);
            }
            else if (opcao == 4){
                plataformaAtual.proximaMusica();
                System.out.println("Musica atual: " + plataformaAtual.listarMusicaAtual());
            }
            else if (opcao == 5){
                plataformaAtual.musicaAnterior();
                System.out.println("Musica atual: " + plataformaAtual.listarMusicaAtual());
            }

        }
        System.out.println("Saindo..");
        sc.close();
    }
}
