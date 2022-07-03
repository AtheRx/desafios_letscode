package desafio7.model.formatacao.factory;

import desafio7.model.formatacao.CamelCaseFormatacao;
import desafio7.model.formatacao.FormatacaoStrategy;
import desafio7.model.formatacao.MaiusculaFormatacao;
import desafio7.model.formatacao.MinusculaFormatacao;
import desafio7.model.formatacao.SemAcentuacaoFormatacao;
import desafio7.model.formatacao.SemFormatacao;
import desafio7.model.formatacao.TiposFormatacao;

public class FormatacaoStrategyFactory {
    public FormatacaoStrategy criarFormatacao(TiposFormatacao formatacao){
        switch (formatacao) {
            case CAMEL_CASE:
                return new CamelCaseFormatacao();
            case MAIUSCULA:
                return new MaiusculaFormatacao();
            case SEM_ACENTUACAO:
                return new SemAcentuacaoFormatacao();
            case MINUSCULA:
                return new MinusculaFormatacao();
            case SEM_FORMATACAO:
                return new SemFormatacao();
            default:
                System.err.println("Formatacao nao compativel.");
                return new SemFormatacao();
        }
    }
}
