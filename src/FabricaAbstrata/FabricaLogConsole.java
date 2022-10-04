package FabricaAbstrata;

import LogsEmConsole.LogEmConsoleTipo1;

public class FabricaLogConsole implements FabricaAbstrata{



    public void adicionaLog(String log){
        LogEmConsoleTipo1.adicionarLog(log);
    }

    @Override
    public void imprimiNoArquivo(String arquivoSaida) {
        System.out.printf("Não é permitido imprimir no arquivo com essa fabrica");
    }

    @Override
    public void imprimiNoConsole() {
        LogEmConsoleTipo1.imprimiNoConsole();

    }




}
