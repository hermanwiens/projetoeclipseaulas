package gestaobiblioteca.model;

public interface Autenticavel {
    boolean autenticar(String login, String senha);
    void alterarSenha(String novaSenha);
}
