package gestaobiblioteca.view;
import java.util.Scanner;

import gestaobiblioteca.model.Perfil;

public class MenuPrincipal {
    public static void login() {
        System.out.println("Opção de Login selecionada.");
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite seu login: ");
        String login = leia.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = leia.nextLine();
        //escolher perfil
        System.out.println("Escolha seu perfil:");
        System.out.println("1. Administrador");
        System.out.println("2. Professor"); 
        System.out.println("3. Aluno"); 
        int perfilEscolhido = leia.nextInt();   
        Perfil perfil = null;
        Usuario usuario = null;
        switch (perfilEscolhido) {
            case 1:
                perfil = Perfil.ADMINISTRADOR;
                break;
            case 2:
                perfil = Perfil.PROFESSOR;
                break;
            case 3:
                perfil = Perfil.ALUNO;
                break;
            default:
                System.out.println("Perfil inválido.");
                return;
        }
        Usuario usuario = null;
    }
    public void exibirMenu(){
        System.out.println("Bem vindo ao sistema");
        System.out.println("1.Login");
        System.out.println("4.sair");

        Scanner leia = new Scanner(System.in);
        int opcao = leia.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Opção de Login selecionada.");
                
                break;
            case 4:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                exibirMenu(); // Chama o menu novamente para tentar outra opção
                break;
        }
    }
}
