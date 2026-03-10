package gestaobiblioteca.model;

public class Adiminstrador extends Usuario {
    public Adiminstrador(long id, String nome, String email, 
        String login, String senha) {
        super(id, nome, email, login, senha, Perfil.ADMIN);
        
    }
    
}
