package edu.marcos.semana06.biblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\033[1;34;7m=====  LIVRARIA WHO IS ARCH LINUX =====\033[m");
        System.out.println("Digite o nome do usuário: ");
        String nome = input.nextLine();
        Pessoa pessoa;
        while(true) {
            System.out.println("""
                    Selecionar Plano: \
                    
                    \033[1m1-\033[m Comum \
                    
                    \033[1m2-\033[m Premium\
                    
                    \033[1m3-\033[m Ver informações\
                    
                    Digite sua opção:\s""");
            int opcao = input.nextInt();
            input.nextLine();
            if (opcao == 1) {
                 pessoa = new UsuarioComum();
                break;
            } else if (opcao == 2) {
                 pessoa = new UsuarioPremium();
                break;
            } else if (opcao == 3) {
                System.out.println("\033[1;35m ===== INFORMAÇÕES DE PASSE ===== \033[m");
                System.out.println("\033[34mUsuario comum tem a capacidade maxima de alugar/adicionar 3 livros, enquanto o Premium tem o limite acresentado para 10.\033[m");
            }
            else System.out.println("\033[1;31mDIGITE UMA OPÇÃO VÁLIDA\033[m");
        }
        pessoa.setNome(nome);
        System.out.println("Boas vindas, "+ pessoa.getNome()+"!");
        System.out.println("Seu limite é ");



    }
}
