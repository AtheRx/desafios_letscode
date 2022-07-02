package desafio2.model.formatacao;

public enum TiposFormatacao {
    SEM_FORMATACAO("sem formatação"),
    SEM_ACENTUACAO("Sem acentuação"),
    CAMEL_CASE("Camel Case"),
    MAIUSCULA("Maiúscula");

    private String tipoFormatacao;

    TiposFormatacao(String tipoFormatacao){
        this.tipoFormatacao = tipoFormatacao;
    }

    public String getTipoFormatacao(){
        return this.tipoFormatacao;
    }
}
