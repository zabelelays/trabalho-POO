package fazenda.Colheita.entidades;

public class Motorista extends Pessoa{

    private String cnh;

    private String codigoMotorista;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCodigoMotorista() {
        return codigoMotorista;
    }

    public void setCodigoMotorista(String codigoMotorista) {
        this.codigoMotorista = codigoMotorista;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "cnh='" + cnh + '\n' +
                ", codigoMotorista='" + codigoMotorista + '\n' +
                '}';
    }
}
