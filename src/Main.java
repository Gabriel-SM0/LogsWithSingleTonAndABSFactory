import FabricaAbstrata.FabricaLogArquivo;
import FabricaAbstrata.FabricaLogConsole;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        System.out.println("------Essa é a primeira instancia da fabrica------");
        FabricaLogConsole fabricaLogConsole = new FabricaLogConsole();
        fabricaLogConsole.adicionaLog("a");
        fabricaLogConsole.adicionaLog("b");
        fabricaLogConsole.adicionaLog("c");
        fabricaLogConsole.imprimiNoConsole();

        System.out.println("------A partir daqui é com outra instancia de FÁBRICA!!!------");

        FabricaLogConsole outraFabricaLogConsole = new FabricaLogConsole();
        outraFabricaLogConsole.adicionaLog("d");
        outraFabricaLogConsole.adicionaLog("e");
        outraFabricaLogConsole.adicionaLog("f");
        outraFabricaLogConsole.imprimiNoConsole();


        FabricaLogArquivo fabricaLogArquivo= new FabricaLogArquivo();
        fabricaLogArquivo.adicionaLog("Log 1");
        fabricaLogArquivo.adicionaLog("Log 2");
        fabricaLogArquivo.adicionaLog("Log 3");
        fabricaLogArquivo.imprimiNoArquivo("Log_de_saida_1.txt");

        FabricaLogArquivo outraFabricaLogArquivo = new FabricaLogArquivo();
        outraFabricaLogArquivo.adicionaLog("Log 4");
        outraFabricaLogArquivo.adicionaLog("Log 5");
        outraFabricaLogArquivo.adicionaLog("Log 6");
        outraFabricaLogArquivo.imprimiNoArquivo("Log_de_saida_2.txt");


    }
}
