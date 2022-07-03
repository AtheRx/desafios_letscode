package desafio7.model.formatacao;

public class MinusculaFormatacao implements FormatacaoStrategy{

    @Override
    public String formatar(String msg) {
        return msg.toLowerCase();
    }




    
}
