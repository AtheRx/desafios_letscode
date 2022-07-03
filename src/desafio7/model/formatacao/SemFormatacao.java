package desafio7.model.formatacao;

public class SemFormatacao implements FormatacaoStrategy{

    @Override
    public String formatar(String msg) {
        return msg;
    }    
}
