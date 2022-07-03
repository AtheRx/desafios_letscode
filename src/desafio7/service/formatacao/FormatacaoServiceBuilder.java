package desafio7.service.formatacao;

import desafio7.model.formatacao.FormatacaoStrategy;


public class FormatacaoServiceBuilder {
    private String msg;
    private FormatacaoStrategy formatacao;

    public FormatacaoServiceBuilder(){

    }
    
    public FormatacaoServiceBuilder msg(String msg){
        this.msg = msg;
        return this;
    }

    public FormatacaoServiceBuilder formatacao(FormatacaoStrategy formatacao){
        this.formatacao = formatacao;
        return this;
    }

    public FormatacaoService build(){
        return new FormatacaoService(msg, formatacao);
    }
}