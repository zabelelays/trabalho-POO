package fazenda.Colheita.entidades;//*isabelle lays r.a 2525810

import java.io.Serializable;



public class Fazenda implements Serializable {
    private String nome;
    private String localizacao;
    private String tamanho;
    private String tipoDeSolo;

    public Fazenda(String nome, String localizacao, String tamanho, String tipoDeSolo) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
        this.tipoDeSolo = tipoDeSolo;
    }

    public Fazenda() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoDeSolo() {
        return tipoDeSolo;
    }

    public void setTipoDeSolo(String tipoDeSolo) {
        this.tipoDeSolo = tipoDeSolo;
    }

    @Override
    public String toString() {
        String retorno;

        retorno = "--------------------------\n" +
                  "Nome da fazenda: " + this.getNome() + "\n" +
                  "--------------------------\n" +
                  "Localizacao: " + this.getLocalizacao() + "\n" +
                  "Tamanho: " + this.getTamanho() + "\n" +
                  "Tipo de solo: " + this.getTipoDeSolo() + "\n\n";
        return retorno;
    }
}
