//*isabelle lays r.a 2525810
package fazenda.Colheita.entidades;



public class Transporte {
    private int codigoFrete;

    private Motorista motorista;

    private String origem;

    private String destino;

    private int tempoDeDeslocamento;


    private float valorFrete;

    public Transporte() {
    }

    public Transporte(int codigoFrete, String origem, String destino, int tempoDeDeslocamento, float valorFrete, Motorista motorista) {
        this.codigoFrete = codigoFrete;
        this.origem = origem;
        this.destino = destino;
        this.tempoDeDeslocamento = tempoDeDeslocamento;
        this.valorFrete = valorFrete;
        this.motorista = motorista;
    }

    public int getCodigoFrete() {
        return codigoFrete;
    }

    public void setCodigoFrete(int codigoFrete) {
        this.codigoFrete = codigoFrete;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTempoDeDeslocamento() {
        return tempoDeDeslocamento;
    }

    public void setTempoDeDeslocamento(int tempoDeDeslocamento) {
        this.tempoDeDeslocamento = tempoDeDeslocamento;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Transporte{" + '\n' +
                "codigoFrete=" + codigoFrete + '\n' +
                ", motorista=" + motorista + '\n' +
                ", origem='" + origem + '\n' +
                ", destino='" + destino + '\n' +
                ", tempoDeDeslocamento=" + tempoDeDeslocamento + '\n' +
                ", valorFrete=" + valorFrete + '\n' +
                '}';
    }
}
