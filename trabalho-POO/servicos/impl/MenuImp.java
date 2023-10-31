//isabelle lays 2525810
package fazenda.Colheita.servicos.impl;

import fazenda.Colheita.entidades.Colheita;
import fazenda.Colheita.entidades.Fazenda;
import fazenda.Colheita.entidades.Transporte;
import fazenda.Colheita.servicos.Leitor;
import fazenda.Colheita.utils.NumConveter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MenuImp {

    Leitor leitor = new LeitorImp();
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    List<Fazenda> fazendas = new ArrayList<>();

    List<Colheita> colheitas = new ArrayList<>();

    List<Transporte> transportes = new ArrayList<>();


    public void exibirOpcoes() throws IOException {
        int opc;
        do {
            System.out.println("Opções: \n" +
                    "1 = exibir fazendas\n" +
                    "2 = cadastrar fazenda\n" +
                    "3 = exibir Colheitas\n" +
                    "4 = cadastrar colheita\n" +
                    "5 = exibir tranportes\n" +
                    "6 = cadastrar tranportes\n" +
                    "7 = sair");
             opc = NumConveter.intConverter(reader.readLine());

            switch (opc) {
                case 1:
                    for (Fazenda fazenda : fazendas) {
                        System.out.println(fazenda);
                    }
                    break;
                case 2:
                    fazendas.add(leitor.lerFazenda());
                    break;
                case 3:
                    for (Colheita colheita : colheitas) {
                        System.out.println(colheita);
                    }
                    break;
                case 4:
                    colheitas.add(leitor.lerColheita());
                    break;
                case 5:
                    for (Transporte transporte : transportes) {
                        System.out.println(transporte);
                    }
                    break;
                case 6:
                    transportes.add(leitor.lerTransporte());
                    break;
            }
        }while (opc != 7);
    }


}
