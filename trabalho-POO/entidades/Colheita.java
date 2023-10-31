//*isabelle lays r.a 2525810
package fazenda.Colheita.entidades;


import java.util.ArrayList;
import java.util.List;

public class Colheita {
    private int quantidadeColhida;
    private float preco;
    private String tipo;
    private Fazenda fazenda;

    private List<Transporte> transportes = new ArrayList<>();
    public Colheita() {
    }
    public Colheita(int quantidadeColhida, float preco, String tipo) {
        this.quantidadeColhida = quantidadeColhida;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Colheita{" +
                "quantidadeColhida=" + quantidadeColhida + '\n' +
                ", preco=" + preco + '\n' +
                ", tipo='" + tipo + '\n' +
                '}';
    }

    public int getQuantidadeColhida() {
        return quantidadeColhida;
    }

    public void setQuantidadeColhida(int quantidadeColhida) {
        this.quantidadeColhida = quantidadeColhida;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public void addTransporte(Transporte transporte){
        transportes.add(transporte);
    }

    public void removeTransporte(Transporte transporte){
        transportes.remove(transporte);
    }

    public List<Transporte> getTransportes() {
        return transportes;
    }
}
