package fazenda.Colheita.servicos;

import fazenda.Colheita.entidades.*;

import java.io.IOException;

public interface Leitor {
     Estoque lerEstoque() throws IOException;
     Fazenda lerFazenda() throws IOException;
     Plantacao lerPlantacao() throws IOException;
     Colheita lerColheita() throws InterruptedException, IOException;
     Transporte lerTransporte() throws IOException;
}
