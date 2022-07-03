package desafio7.service.email;

import java.util.ArrayList;
import java.util.List;

import desafio7.model.mensagem.Mensagem;

public class EmailServiceBuilder {
    private String remetente;
    private String destinatario;
    private List<String> cc = new ArrayList<>();
    private String assunto;
    private Mensagem msg;

    public EmailServiceBuilder(){
    }

    public EmailServiceBuilder remetente(String remetente){
        this.remetente = remetente;
        return this;
    }

    public EmailServiceBuilder destinatario(String destinatario){
        this.destinatario = destinatario;
        return this;
    }

    public EmailServiceBuilder cc(String cc){
        this.cc.add(cc);
        return this;
    }

    public EmailServiceBuilder assunto(String assunto){
        this.assunto = assunto;
        return this;
    }

    public EmailServiceBuilder msg(Mensagem msg){
        this.msg = msg;
        return this;
    }

    private void validar(){
        if (this.remetente == null){
            throw new RuntimeException("Remetente não pode estar vazio.");
        }
        if (this.destinatario == null){
            throw new RuntimeException("Destinatario não pode estar vazio.");
        }
    }

    public EmailService build(){
        validar();
        return new EmailService(remetente, destinatario, cc, assunto, msg);
    }

}
