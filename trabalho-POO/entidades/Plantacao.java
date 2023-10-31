//isabelle lays 2525810
package fazenda.Colheita.entidades;


public class Plantacao {

    private String tipoDeCultura;

    private String dataDoPlantio;


    private float areaDoPlantio;

    public Plantacao() {
    }

    public Plantacao(String tipoDeCultura, String dataDoPlantio, float areaDoPlantio) {
        this.tipoDeCultura = tipoDeCultura;
        this.dataDoPlantio = dataDoPlantio;
        this.areaDoPlantio = areaDoPlantio;
    }

    public String getTipoDeCultura() {
        return tipoDeCultura;
    }

    public void setTipoDeCultura(String tipoDeCultura) {
        this.tipoDeCultura = tipoDeCultura;
    }

    public String getDataDoPlantio() {
        return dataDoPlantio;
    }

    public void setDataDoPlantio(String dataDoPlantio) {
        this.dataDoPlantio = dataDoPlantio;
    }

    public float getAreaDoPlantio() {
        return areaDoPlantio;
    }

    public void setAreaDoPlantio(float areaDoPlantio) {
        this.areaDoPlantio = areaDoPlantio;
    }

    @Override
    public String toString() {
        return "Plantacao{" +
                "tipoDeCultura='" + tipoDeCultura + '\n' +
                ", dataDoPlantio=" + dataDoPlantio + '\n' +
                ", areaDoPlantio=" + areaDoPlantio + '\n' +
                '}';
    }
}
