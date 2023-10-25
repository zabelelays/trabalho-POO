package fazenda.Colheita.entidades;


public class Estoque {
    private String dataDaArmazenagem;
    private String dataDaSaida;

    private int quantidadeArmazenado;

    private int idCultivo;

    public Estoque() {
    }

    public Estoque(String dataDaArmazenagem, String dataDaSaida, int quantidadeArmazenado, int idCultivo) {
        this.dataDaArmazenagem = dataDaArmazenagem;
        this.dataDaSaida = dataDaSaida;
        this.quantidadeArmazenado = quantidadeArmazenado;
        this.idCultivo = idCultivo;
    }

    public String getDataDaArmazenagem() {
        return dataDaArmazenagem;
    }

    public void setDataDaArmazenagem(String dataDaArmazenagem) {
        this.dataDaArmazenagem = dataDaArmazenagem;
    }

    public String getDataDaSaida() {
        return dataDaSaida;
    }

    public void setDataDaSaida(String dataDaSaida) {
        this.dataDaSaida = dataDaSaida;
    }

    public int getQuantidadeArmazenado() {
        return quantidadeArmazenado;
    }

    public void setQuantidadeArmazenado(int quantidadeArmazenado) {
        this.quantidadeArmazenado = quantidadeArmazenado;
    }

    public int getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "dataDaArmazenagem=" + dataDaArmazenagem +
                ", dataDaSaida=" + dataDaSaida +
                ", quantidadeArmazenado=" + quantidadeArmazenado +
                ", idCultivo=" + idCultivo +
                '}';
    }

    public void adicionarAoEstoque(int i) {
        this.quantidadeArmazenado += i;
    }

    public void removerDoEstoque(int i) {
        this.quantidadeArmazenado -= i;
    }
}
