package br.com.relatorio.model;

import br.com.relatorio.utils.EnumExtensaoArquivo;
import br.com.relatorio.utils.EnumRelatorios;
import java.io.Serializable;
import java.util.Map;

public class Relatorio implements Serializable {
    
    private EnumRelatorios relatorio;
    private int modelo;
    private Map parametros;
    private EnumExtensaoArquivo extencao;

    public EnumRelatorios getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(EnumRelatorios relatorio) {
        this.relatorio = relatorio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Map getParametros() {
        return parametros;
    }

    public void setParametros(Map parametros) {
        this.parametros = parametros;
    }

    public EnumExtensaoArquivo getExtencao() {
        return extencao;
    }

    public void setExtencao(EnumExtensaoArquivo extencao) {
        this.extencao = extencao;
    }
}
