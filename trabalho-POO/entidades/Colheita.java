//*isabelle lays r.a 2525810
package fazenda.Colheita.entidades;



public class Colheita {
    private int quantidadeColhida;
    private float preco;
    private String tipo;

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
                "quantidadeColhida=" + quantidadeColhida +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
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
}
