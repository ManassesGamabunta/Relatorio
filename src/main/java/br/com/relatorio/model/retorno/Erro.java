package br.com.relatorio.model.retorno;

import java.io.Serializable;

public class Erro implements Serializable, Retorno {
    
    private String codigo;
    private String mensagem;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}