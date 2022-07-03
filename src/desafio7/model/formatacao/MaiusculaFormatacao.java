package desafio7.model.formatacao;

public class MaiusculaFormatacao implements FormatacaoStrategy{

    @Override
    public String formatar(String msg) {
        return msg.toUpperCase();
    }




    
}
