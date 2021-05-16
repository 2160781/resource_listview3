package com.example.android_resource;

public class PassoReceita {

    private String texto;
    private String imagem;
    private Boolean feito;

    PassoReceita(String texto, String imagem) {
        this.texto = texto;
        this.imagem = imagem;
        this.feito = false;
    }

    public String getImagem() {
        return imagem;
    }

    public String getTexto() {
        return texto;
    }

    public void setFeito(Boolean feito) {
        this.feito = feito;
    }
}
