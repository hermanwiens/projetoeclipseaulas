package gestaobiblioteca.model;

import java.util.List;

public class Professor extends Usuario {
    public Professor(long id, String nome, String email, 
        String login, String senha) {
        super(id, nome, email, login, senha, Perfil.PROFESSOR);
        
    }
    
}
