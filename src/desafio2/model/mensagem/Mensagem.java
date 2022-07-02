package desafio2.model.mensagem;

import desafio2.model.formatacao.TiposFormatacao;
import desafio2.model.formatacao.factory.FormatacaoStrategyFactory;
import desafio2.service.formatacao.FormatacaoService;
import desafio2.service.formatacao.FormatacaoServiceBuilder;

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
