package desafio7.service.email;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import desafio7.model.mensagem.Mensagem;

public class EmailService {
    private String remetente;
    private String destinatario;
    private List<String> cc = new ArrayList<>();
    private String assunto;
    private Mensagem msg;


    protected EmailService(String remetente, String destinatario, List<String> cc, String assunto, Mensagem msg){
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.cc = cc;
        this.assunto = assunto;
        this.msg = msg;
    }
    
    

    public String getRemetente() {
        return this.remetente;
    }



    public String getDestinatario() {
        return this.destinatario;
    }



    public List<String> getCc() {
        return this.cc;
    }



    public String getAssunto() {
        return this.assunto;
    }



    public Mensagem getMsg() {
        return this.msg;
    }



    public void enviar(){
        System.out.println(
            "\n" +
            "EMAIL ENVIADO COM SUCESSO \n"+
            "DE: " +  getRemetente() + "\n"+
            "PARA: "+ getDestinatario() + "\n" +
            "Assunto: "+ getAssunto() + "\n" +
            "MENSAGEM: " + getMsg().toString() + "\n" +
            LocalDateTime.now() + "\n"
        );
    }   


}
