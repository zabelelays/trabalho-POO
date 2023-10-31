package fazenda.Colheita;//*isabelle lays r.a 2525810

import fazenda.Colheita.servicos.impl.MenuImp;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MenuImp menu = new MenuImp();

        try {
          menu.exibirOpcoes();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

}



