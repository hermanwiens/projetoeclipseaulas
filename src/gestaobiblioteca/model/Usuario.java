package gestaobiblioteca.model;

public abstract class Usuario implements Autenticavel {
    private long id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private boolean primeiroacesso = true;
    private Perfil perfil;

    public Usuario(long id, String nome, String email, 
        String login, String senha,  Perfil perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }
    public void setId(long id) {
        if (id > 0) {
            
        } else {
            throw new IllegalArgumentException("ID deve ser maior que zero.");
            
        }
    }
}

    
