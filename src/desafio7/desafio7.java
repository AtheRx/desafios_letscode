package desafio7;

import desafio7.model.formatacao.TiposFormatacao;
import desafio7.model.mensagem.Mensagem;
import desafio7.model.mensagem.MensagemBuilder;
import desafio7.service.email.EmailService;
import desafio7.service.email.EmailServiceBuilder;

public class Desafio7{

    /**
    Crie uma estrutura de classes para simular o envio de uma mensagem por e-mail, mas, antes de enviar a mensagem, 
    disponibilizar diversos tipos de formatações. A mensagem pode ser enviada com nenhuma, uma ou mais de uma das seguintes 
    formatações:

        - Formatar tudo em maiúsculo
        - Formatar tudo em minúsculo
        - Formatar em camelCase
        - Remover acentuação
    */ 
    public static void main(String[] args) {
        teste(TiposFormatacao.CAMEL_CASE);
        teste(TiposFormatacao.SEM_ACENTUACAO);
        teste(TiposFormatacao.MAIUSCULA);
        teste(TiposFormatacao.MINUSCULA);
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