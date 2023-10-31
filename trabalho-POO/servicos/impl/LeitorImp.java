//isabelle lays r.a 2525810
package fazenda.Colheita.servicos.impl;

import fazenda.Colheita.entidades.*;
import fazenda.Colheita.servicos.Leitor;
import fazenda.Colheita.utils.NumConveter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Date;

public class LeitorImp implements Leitor {

    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public Estoque lerEstoque() throws IOException {
        Estoque estoque = new Estoque();
        System.out.println("Digite a quantidade armazenada:");
        estoque.setQuantidadeArmazenado(NumConveter.intConverter(reader.readLine()));
        System.out.println("Digite a data de armazenagem:");
        estoque.setDataDaArmazenagem(reader.readLine());
        System.out.println("Digite a data de saída:");
        estoque.setDataDaSaida(reader.readLine());
        System.out.println("Digite o ID do cultivo:");
        estoque.setIdCultivo(NumConveter.intConverter(reader.readLine()));
        return estoque;
    }

    @Override
    public Fazenda lerFazenda() throws IOException {
        Fazenda fazenda = new Fazenda();
        System.out.println("Digite o nome da fazenda:");
        fazenda.setNome(reader.readLine());
        System.out.println("Digite a localização da fazenda:");
        fazenda.setLocalizacao(reader.readLine());
        System.out.println("Digite o tamanho da fazenda:");
        fazenda.setTamanho(NumConveter.intConverter(reader.readLine()));
        System.out.println("Digite o tipo de solo da fazenda:");
        fazenda.setTipoDeSolo(reader.readLine());
        System.out.println("Cadastro de estoque: ");
        fazenda.setEstoque(lerEstoque());
        adicionarPlantacoes(fazenda);
        adicionarColheita(fazenda);
        return fazenda;
    }

    @Override
    public Plantacao lerPlantacao() throws IOException {
        Plantacao plantacao = new Plantacao();
        System.out.println("Digite a data do plantio:");
        plantacao.setDataDoPlantio(reader.readLine());
        System.out.println("Digite o tipo de cultura:");
        plantacao.setTipoDeCultura(reader.readLine());
        System.out.println("Digite a área do plantio:");
        plantacao.setAreaDoPlantio(NumConveter.intConverter(reader.readLine()));
        return plantacao;
    }

    @Override
    public Colheita lerColheita() throws IOException {
        Colheita colheita = new Colheita();
        System.out.println("Digite a quantidade colhida:");
        colheita.setQuantidadeColhida(NumConveter.intConverter(reader.readLine()));
        System.out.println("Digite o preço:");
        colheita.setPreco(NumConveter.intConverter(reader.readLine()));
        System.out.println("Digite o tipo de colheita:");
        colheita.setTipo(reader.readLine());
        return colheita;
    }

    @Override
    public Transporte lerTransporte() throws IOException {
        Transporte transporte = new Transporte();
        System.out.println("Digite o código de frete:");
        transporte.setCodigoFrete(NumConveter.intConverter(reader.readLine()));
        System.out.println("Digite o tempo de deslocamento em horas:");
        transporte.setTempoDeDeslocamento(NumConveter.intConverter(reader.readLine()));
        System.out.println("Digite o valor do frete em reais:");
        transporte.setValorFrete(NumConveter.intConverter(reader.readLine()));
        System.out.println("Digite a origem");
        transporte.setOrigem(reader.readLine());
        System.out.println("Digite o destino:");
        transporte.setDestino(reader.readLine());
        transporte.setMotorista(lerMotorista());
        return transporte;
    }

    public Motorista lerMotorista() throws IOException {
        Motorista motorista = new Motorista();
        System.out.println("Digite a idade do motorista");
        motorista.setIdade(NumConveter.intConverter(reader.readLine()));
        System.out.println("Digite o nome do motorista");
        motorista.setNome(reader.readLine());
        System.out.println("Digite o documento do motorista");
        motorista.setDocumento(reader.readLine());
        System.out.println("Digite a data de nascimento do motorista");
        motorista.setDataNascimento(reader.readLine());
        System.out.println("Digite o endereco do motorista");
        motorista.setEndereco(reader.readLine());
        System.out.println("Digite o cnh do motorista");
        motorista.setCodigoMotorista(reader.readLine());
        System.out.println("Digite o codigo do motorista");
        motorista.setCodigoMotorista(reader.readLine());
        return motorista;
    }

    public void adicionarPlantacoes(Fazenda fazenda) throws IOException {
        System.out.println("Gostaria de adicionar uma plantacao?");
        String continuar = reader.readLine();
        while (!continuar.equals("nao")) {
            var plantacao = lerPlantacao();
            fazenda.addPlantacao(plantacao);
            System.out.println("Gostaria de adicionar mais plantações?");
            continuar = reader.readLine();
        }
    }

    public void adicionarColheita(Fazenda fazenda) throws IOException {
        System.out.println("Gostaria de adicionar uma colheita?");
        String continuar = reader.readLine();
        while (!continuar.equals("nao")) {
            var colheita = lerColheita();
            fazenda.addColheita(colheita);
            System.out.println("Gostaria de adicionar mais colheitas?");
            continuar = reader.readLine();
        }
    }
}
