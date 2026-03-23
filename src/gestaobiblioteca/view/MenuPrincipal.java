package gestaobiblioteca.view;

import java.util.Scanner;

public class MenuPrincipal {
    public void exibirMenu(){
        System.out.println("Bem vindo ao sistema");
        System.out.println("1.Login");
        System.out.println("4.sair");

        Scanner leia = new Scanner(System.in);
        int opcao = leia.nextInt();
        
        switch (opcao) {
            case 1:
                MenuLogin menuLogin = new MenuLogin();
                menuLogin.exibirMenu();
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
