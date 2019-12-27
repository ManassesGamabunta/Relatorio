package br.com.relatorio.utils;

public enum EnumExtensaoArquivo {

    PDF("1"),
    EXCEL("2"),
    DOCX("3");

    private String extensao;

    EnumExtensaoArquivo(String extensao) {
        this.extensao = extensao;
    }

    public String getExtencao() {
        return extensao;
    }

}
