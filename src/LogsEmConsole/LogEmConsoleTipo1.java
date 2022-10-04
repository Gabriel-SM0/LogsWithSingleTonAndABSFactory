package LogsEmConsole;

import java.util.ArrayList;
import java.util.List;

public class LogEmConsoleTipo1 implements LogsEmConsole {

    private static final List<String> listaDeLogs = new ArrayList<>();
    private static LogsEmConsole logsEmConsoleUnicaInstancia;

    //syncronized é mais por firula da minha parte, serve pra evitar o multithred do metodo e nao criar
    //acidentalmente duas instancias.
    public static synchronized LogsEmConsole inicializaEObtemLogs(){
        if (logsEmConsoleUnicaInstancia == null){
            logsEmConsoleUnicaInstancia = new LogEmConsoleTipo1();
        }
        return logsEmConsoleUnicaInstancia;
    }

    public static void adicionarLog(String log){
        LogEmConsoleTipo1.listaDeLogs.add(log);
    };

//    public static void setListaDeLogs(List<String> listaDeLogs) {
//
//        LogEmConsoleTipo1.listaDeLogs = listaDeLogs;
//    }


    public static List<String> getListaDeLogs() {
        return listaDeLogs;
    }

    public static void imprimiNoConsole() {
        int index = 0;
        for (index = 0; index < LogEmConsoleTipo1.getListaDeLogs().size(); index++) {
            System.out.println(LogEmConsoleTipo1.getListaDeLogs().get(index));

        }
    }


}
