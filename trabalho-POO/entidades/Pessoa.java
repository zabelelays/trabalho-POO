//isabelle lays r.a 2525810
package fazenda.Colheita.entidades;

public abstract class Pessoa {
    private String nome;

    private String documento;

    private int idade;
    private String dataNascimento;

    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\n' +
                ", documento='" + documento + '\n' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\n' +
                ", endereco='" + endereco + '\n' +
                '}';

    }
}
