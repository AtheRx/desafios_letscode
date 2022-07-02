package desafio2;

import desafio2.model.formatacao.TiposFormatacao;
import desafio2.model.mensagem.Mensagem;
import desafio2.model.mensagem.MensagemBuilder;
import desafio2.service.email.EmailService;
import desafio2.service.email.EmailServiceBuilder;

public class desafio2{
    public static void main(String[] args) {
        teste(TiposFormatacao.CAMEL_CASE);
        teste(TiposFormatacao.SEM_ACENTUACAO);
        teste(TiposFormatacao.MAIUSCULA);
        teste(TiposFormatacao.SEM_FORMATACAO);

    } 

    public static void teste(TiposFormatacao tiposFormatacao){

        Mensagem mensagem = new MensagemBuilder()
            .texto("TeSte DIfêrénte")
            .formatacao(tiposFormatacao)
            .build();

        EmailService email = new EmailServiceBuilder()
            .remetente("teste@teste.com")
            .destinatario("teste2@teste2.com")
            .cc("teste3@teste3.com")
            .cc("teste4@teste4.com")
            .assunto("teste")
            .msg(mensagem)
            .build();

        email.enviar();
    }
}