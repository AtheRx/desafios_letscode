package desafio2.model.formatacao.factory;

import desafio2.model.formatacao.CamelCaseFormatacao;
import desafio2.model.formatacao.FormatacaoStrategy;
import desafio2.model.formatacao.MaiusculaFormatacao;
import desafio2.model.formatacao.SemAcentuacaoFormatacao;
import desafio2.model.formatacao.SemFormatacao;
import desafio2.model.formatacao.TiposFormatacao;

public class FormatacaoStrategyFactory {
    public FormatacaoStrategy criarFormatacao(TiposFormatacao formatacao){
        switch (formatacao) {
            case CAMEL_CASE:
                return new CamelCaseFormatacao();
            case MAIUSCULA:
                return new MaiusculaFormatacao();
            case SEM_ACENTUACAO:
                return new SemAcentuacaoFormatacao();
            case SEM_FORMATACAO:
                return new SemFormatacao();
            default:
                System.err.println("Formatacao nao compativel.");
                return new SemFormatacao();
        }
    
    }
}
