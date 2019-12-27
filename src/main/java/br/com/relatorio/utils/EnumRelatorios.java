package br.com.relatorio.utils;

/**
 *
 * @author manases
 */
public enum EnumRelatorios {
    
    RELATORIO01("1"),
    RELATORIO02("2"),
    RELATORIO03("3");

    private String relatorio;

    EnumRelatorios(String relatorio) {
        this.relatorio = relatorio;
    }

    public String getRelatorio() {
        return relatorio;
    }
}
