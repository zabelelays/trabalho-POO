
package fazenda.Colheita.entidades; //*isabelle lays r.a 2525810

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Fazenda implements Serializable {
    private String nome;

    private String localizacao;
    private int tamanho;
    private String tipoDeSolo;

    private Estoque estoque;

    private List<Plantacao> plantacoes = new ArrayList<>();

    private List<Colheita> colheitas = new ArrayList<>();

    public Fazenda(String nome, String localizacao, int tamanho, String tipoDeSolo) {
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

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoDeSolo() {
        return tipoDeSolo;
    }

    public void setTipoDeSolo(String tipoDeSolo) {
        this.tipoDeSolo = tipoDeSolo;
    }

    public void addPlantacao(Plantacao plantacao){
        plantacoes.add(plantacao);
    }

    public void removePlantacaoes(Plantacao plantacao){
        plantacoes.remove(plantacao);
    }

    public void addColheita(Colheita colheita){
        colheitas.add(colheita);
    }

    public void removeColheita(Colheita colheita){
        colheitas.remove(colheita);
    }

    public List<Plantacao> getPlantacoes() {
        return plantacoes;
    }

    public List<Colheita> getColheitas() {
        return colheitas;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Fazenda{" +
                "nome='" + nome + '\n' +
                ", localizacao='" + localizacao + '\n' +
                ", tamanho='" + tamanho + '\n' +
                ", tipoDeSolo='" + tipoDeSolo + '\n' +
                ", estoque=" + estoque + '\n' +
                ", plantacoes=" + plantacoes + '\n' +
                ", colheitas=" + colheitas + '\n' +
                '}';
    }
}
