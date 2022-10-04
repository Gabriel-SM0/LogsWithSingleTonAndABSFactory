package LogsEmArquivo;

import LogsEmConsole.LogsEmConsole;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogEmArquivoTipo1 implements LogEmArquivo {

    private static final List<String> listaDeLogs = new ArrayList<>();
    private static LogEmArquivoTipo1 logEmArquivoTipo1UnicaInstancia;

    //syncronized é mais por firula da minha parte, serve pra evitar o multithred do metodo e nao criar
    //acidentalmente duas instancias.
    public static synchronized LogEmArquivoTipo1 inicializaEObtemLogs() {
        if (logEmArquivoTipo1UnicaInstancia == null) {
            logEmArquivoTipo1UnicaInstancia = new LogEmArquivoTipo1();
        }
        return logEmArquivoTipo1UnicaInstancia;
    }

    public static void adicionarLog(String log) {
        LogEmArquivoTipo1.listaDeLogs.add(log);
    }




    public static List<String> getListaDeLogs() {
        return listaDeLogs;
    }

    public static void imprimiNoArquivo(String arquivoDeSaida) throws IOException {

        FileOutputStream fluxoDeEntrada2 = null;//pega os bytes

        fluxoDeEntrada2 = new FileOutputStream(arquivoDeSaida);
        Writer writer = new OutputStreamWriter(fluxoDeEntrada2);//transforma os bytes em caracteres
        BufferedWriter bwriter = new BufferedWriter(writer);//junta os caracteres emum buffer unico por linha


        int index = 0;
        for (index = 0; index < LogEmArquivoTipo1.getListaDeLogs().size(); index++) {


            bwriter.write(LogEmArquivoTipo1.getListaDeLogs().get(index));
            bwriter.newLine();



        }
        bwriter.close();
    }


}
