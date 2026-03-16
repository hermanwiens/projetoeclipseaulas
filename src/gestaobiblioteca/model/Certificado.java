package gestaobiblioteca.model;

import java.time.LocalDateTime;

public class Certificado {
    private long id;
    private Trabalho trabalho;
    private LocalDateTime dataEmissao;
    private String codigoVerificacao;

    public Certificado(Trabalho trabalho, LocalDateTime dataEmissao) {
        this.id = id;
        this.trabalho = trabalho;
        this.dataEmissao = dataEmissao;
    }

    public void gerarCodigoVerificacao() {
        // Lógica para gerar um código de verificação único
        this.codigoVerificacao = "CERT-" + System.currentTimeMillis();
    }

}
