package br.com.relatorio.model.retorno;

import br.com.relatorio.utils.EnumExtensaoArquivo;
import java.io.Serializable;

public class RespRelatorio implements Serializable, Retorno {    
    
    EnumExtensaoArquivo extensao;
    byte[] relatorio;

    public EnumExtensaoArquivo getExtensao() {
        return extensao;
    }

    public void setExtensao(EnumExtensaoArquivo extensao) {
        this.extensao = extensao;
    }

    public byte[] getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(byte[] relatorio) {
        this.relatorio = relatorio;
    }

}