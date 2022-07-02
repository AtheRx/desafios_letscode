package desafio2.model.formatacao;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class SemAcentuacaoFormatacao implements FormatacaoStrategy {

    @Override
    public String formatar(String msg) {
        String stringNormalizada = Normalizer.normalize(msg, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        return pattern.matcher(stringNormalizada).replaceAll("");
    }





    
}
