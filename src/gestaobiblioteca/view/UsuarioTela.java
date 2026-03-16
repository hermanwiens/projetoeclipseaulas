package gestaobiblioteca.view;

import gestaobiblioteca.model.Usuario;

public class UsuarioTela {
    public static void main(String[] args) {
            System.out.println("Tela de Usuário");

            Usuario usuario = new Usuario(0, "João Silva", "joao.silva@example.com", "joao.silva", "senha123");
            usuario.setId(1);
            System.out.println("ID do usuário: " + usuario.getId());
        
    }

}
