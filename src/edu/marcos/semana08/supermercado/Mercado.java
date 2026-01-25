package edu.marcos.semana08.supermercado;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ServicoMercado servicoAtual = null;
        Pessoa pessoaAtual = null;
        PilhaPao<PaoFrances> pilhaPaoFrances = new PilhaPao<>();
        PilhaPao<PaoItaliano> pilhaPaoItalianos = new PilhaPao<>();
        PilhaPao<Baguete> pilhaBaguetes = new PilhaPao<>();
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite seu saldo: ");
        double saldo = input.nextDouble();
        pessoaAtual = new Pessoa(nome, saldo);
        System.out.println(pessoaAtual);
        while(true){
            System.out.println("\033[1;35m=== SUPER MERCADO MARIN ===\033[m");
            System.out.println("Pessoas no mercado: "+ pessoaAtual.getTotalPessoasMercadado());
            System.out.println("____________________________________________________");
            System.out.println("""
                    O que deseja fazer?
                    1 - Fazer pão
                    2 - Novo cliente
                    3 - Comprar pão
                    4 - Ver pães
                    5 - Sair""");
            int opcao = input.nextInt();
            input.nextLine();
            System.out.println("____________________________________________________");
            if (opcao == 1){
                System.out.println("""
                        Qual pão deseja fazer?
                        1 - Francês
                        2 - Italiano
                        3 - Baguete""");
                opcao = input.nextInt();
                input.nextLine();
                if (opcao == 1) {
                    pilhaPaoFrances.push(new PaoFrances());
                    System.out.println("Pão francês adicionado com sucesso!");
                }
                else if (opcao ==2) {
                    pilhaPaoItalianos.push(new PaoItaliano());
                    System.out.println("Pão Italiano adicionado com sucesso!");
                }
                else if (opcao ==3) {
                    pilhaBaguetes.push(new Baguete());
                    System.out.println("Baguete adicionado com sucesso!");
                }
                else System.out.println("Opção inválida!!");
                System.out.println("____________________________________________________");

            }
            else if (opcao == 2){
                System.out.print("Digite seu nome: ");
                nome = input.nextLine();
                System.out.print("Digite seu saldo: ");
                saldo = input.nextDouble();
                pessoaAtual = new Pessoa(nome, saldo);
                System.out.println(pessoaAtual);
                System.out.println("____________________________________________________");
            }
            else if (opcao == 3){
                System.out.println("""
                        Qual pão deseja comprar?
                        1 - Francês
                        2 - Italiano
                        3 - Baguete""");
                opcao = input.nextInt();
                input.nextLine();
                if (opcao == 1) {
                    servicoAtual = new ServicoMercado(pilhaPaoFrances);
                    servicoAtual.comprarPao(pessoaAtual);
                }
                else if (opcao ==2) {
                    servicoAtual = new ServicoMercado(pilhaPaoItalianos);
                    servicoAtual.comprarPao(pessoaAtual);

                }
                else if (opcao ==3) {
                    servicoAtual = new ServicoMercado(pilhaBaguetes);
                    servicoAtual.comprarPao(pessoaAtual);

                }
                else System.out.println("Opção inválida!");
                System.out.println("____________________________________________________");
            }
            else if (opcao == 4){
                System.out.println("==== BAGUETES ====");
                System.out.println(pilhaBaguetes);
                System.out.println("____________________________________________________");
                System.out.println(pilhaPaoFrances);
                System.out.println("==== PÃO FRÂNCES ====");
                System.out.println("____________________________________________________");
                System.out.println(pilhaPaoItalianos);
                System.out.println("==== PÃO ITALIANO ====");
                System.out.println("____________________________________________________");
            }
            else if (opcao == 5){
                System.out.print("Saindo...");
                break;
            }
        }
        System.out.println("Saindo do mercado!!");
        input.close();
    }
}