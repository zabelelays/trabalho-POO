package fazenda.Colheita;//*isabelle lays r.a 2525810

import java.io.IOException;


import fazenda.Colheita.servicos.impl.LeitorImp;

public class Main {
    public static void main(String[] args) {
        LeitorImp leitor = new LeitorImp();

        try {
            System.out.println(leitor.lerEstoque());
            System.out.println(leitor.lerEstoque());
            System.out.println(leitor.lerPlantacao());
            System.out.println(leitor.lerTransporte());
            System.out.println(leitor.lerFazenda());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}


