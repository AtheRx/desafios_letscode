package desafio7.model.mensagem;

import desafio7.model.formatacao.TiposFormatacao;
import desafio7.model.formatacao.factory.FormatacaoStrategyFactory;
import desafio7.service.formatacao.FormatacaoService;
import desafio7.service.formatacao.FormatacaoServiceBuilder;

public class Mensagem {
    private String texto;
    
    protected Mensagem(String texto, TiposFormatacao formatacao){
        FormatacaoStrategyFactory formatacaoFactory = new FormatacaoStrategyFactory();
        FormatacaoService formatacaoService = new FormatacaoServiceBuilder()
            .msg(texto)
            .formatacao(formatacaoFactory.criarFormatacao(formatacao))
            .build();
            
        this.texto = formatacaoService.processarMensagem();
    }

    @Override
    public String toString() {
        return this.texto;
    }

}
