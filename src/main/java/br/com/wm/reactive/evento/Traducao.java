package br.com.wm.reactive.evento;

import java.util.List;

public record Traducao(List<Texto> translations) {

    public String getTexto() {
        return translations.get(0).text();
    }
}
