package FabricaAbstrata;

import LogsEmArquivo.LogEmArquivo;
import LogsEmArquivo.LogEmArquivoTipo1;

import java.io.IOException;

public class FabricaLogArquivo implements FabricaAbstrata{


    @Override
    public void imprimiNoArquivo(String arquivoSaida) {
        try {
            LogEmArquivoTipo1.imprimiNoArquivo(arquivoSaida);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void imprimiNoConsole() {
        System.out.printf("Não é permitido imprimir na tela com essa fabrica");

    }

    @Override
    public void adicionaLog(String log) {
        LogEmArquivoTipo1.adicionarLog(log);

    }


}
