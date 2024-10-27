package br.com.wm.reactive.evento;

public record DadosTraducao(DadosResposta responseData) {

    public String getTexto() {
        return this.responseData.translatedText();
    }

}
