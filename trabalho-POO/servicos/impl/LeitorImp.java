package fazenda.Colheita.servicos.impl;

import fazenda.Colheita.entidades.*;
import fazenda.Colheita.servicos.Leitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Date;

public class LeitorImp implements Leitor{

    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    public Estoque lerEstoque() throws IOException {
            System.out.println("Digite a quantidade armazenada:");
            var quantidadeArmazenada = reader.readLine();
            System.out.println("Digite a data de armazenagem:");
            String dataArmazenagem = reader.readLine();
            System.out.println("Digite a data de saída:");
            String dataSaida = reader.readLine();
            System.out.println("Digite o ID do cultivo:");
            var idCultivo = reader.readLine();
            Estoque estoque = new Estoque();
            estoque.setDataDaArmazenagem(dataArmazenagem);
            estoque.setDataDaSaida(dataSaida);
            estoque.setIdCultivo(Integer.valueOf(idCultivo));
            estoque.setQuantidadeArmazenado(Integer.valueOf(quantidadeArmazenada));
            return estoque;
        }

    @Override
    public Fazenda lerFazenda() throws IOException {
            System.out.println("Digite o nome da fazenda:");
            String nomeFazenda = reader.readLine();
            System.out.println("Digite a localização da fazenda:");
            String localizacaoFazenda = reader.readLine();
            System.out.println("Digite o tamanho da fazenda:");
            String tamanhoFazenda = reader.readLine();
            System.out.println("Digite o tipo de solo da fazenda:");
            String tipoSoloFazenda = reader.readLine();
            Fazenda fazenda = new Fazenda(nomeFazenda, localizacaoFazenda, tamanhoFazenda, tipoSoloFazenda);
            return fazenda;
        }

    @Override
    public Plantacao lerPlantacao() throws IOException {
            System.out.println("Digite a data do plantio:");
            String dataPlantio = reader.readLine();
            System.out.println("Digite o tipo de cultura:");
            String tipoCultura = reader.readLine();
            System.out.println("Digite a área do plantio:");
            var areaPlantio = reader.readLine();
            Plantacao plantacao = new Plantacao();
            plantacao.setDataDoPlantio(dataPlantio);
            plantacao.setTipoDeCultura(tipoCultura);
            plantacao.setAreaDoPlantio(Float.valueOf(areaPlantio));
            return plantacao;
        }

    @Override
    public Colheita lerColheita() throws InterruptedException, IOException {
            System.out.println("Digite a quantidade colhida:");
            var quantidadeColhida = reader.readLine();
            System.out.println("Digite o preço:");
            var preco = reader.readLine();
            System.out.println("Digite o tipo de colheita:");
            String tipo = reader.readLine();
            Colheita colheita = new Colheita();
            colheita.setTipo(tipo);
            colheita.setQuantidadeColhida(Integer.parseInt(quantidadeColhida));
            colheita.setPreco(Float.parseFloat(preco));
            return colheita;
        }

    @Override
    public Transporte lerTransporte() throws IOException {
            System.out.println("Digite o código de frete:");
            var codigoFrete = reader.readLine();
            System.out.println("Digite a origem");
            String origem = reader.readLine();
            System.out.println("Digite o destino:");
            String destino = reader.readLine();
            System.out.println("Digite o tempo de deslocamento em horas:");
            var tempoDeslocamento = reader.readLine();
            System.out.println("Digite o valor do frete em reais:");
            var valorFrete = reader.readLine();
            Transporte transporte = new Transporte();
            transporte.setCodigoFrete(Integer.parseInt(codigoFrete));
            transporte.setOrigem(origem);
            transporte.setDestino(destino);
            transporte.setTempoDeDeslocamento(Integer.parseInt(tempoDeslocamento));
            transporte.setValorFrete(Float.parseFloat(valorFrete));
            return transporte;
    }
}
