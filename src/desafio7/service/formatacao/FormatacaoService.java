package desafio7.service.formatacao;

import desafio7.model.formatacao.FormatacaoStrategy;

public class FormatacaoService {
    private String msg;
    private FormatacaoStrategy strategy;

    protected FormatacaoService(String msg, FormatacaoStrategy strategy){
        this.msg = msg;
        this.strategy = strategy;
    }

    public String processarMensagem(){
        return  strategy.formatar(msg);   
    }
}
