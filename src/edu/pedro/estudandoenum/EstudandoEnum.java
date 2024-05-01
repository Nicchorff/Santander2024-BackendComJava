package edu.pedro.estudandoenum;

public enum EstudandoEnum {
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ","Rio de Janeiro")
    ;

    private String nome;
    private String sigla;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    EstudandoEnum(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
}
