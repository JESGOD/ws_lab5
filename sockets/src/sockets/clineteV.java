package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class clineteV {
    private Socket sc_cliente;
    private BufferedReader bufferIn, bufferKey;
    private PrintStream dtout; 
    private final int puerto;
    private String ip;

    public clineteV(int puerto, String ip) {
        this.puerto = puerto;
        this.ip = ip;
    }
    
    public void iniciar_cliente() throws IOException{
    sc_cliente = new Socket(ip,puerto);
    bufferIn = new BufferedReader(new InputStreamReader(sc_cliente.getInputStream()));
    bufferKey = new BufferedReader(new InputStreamReader(System.in));
    String salida = bufferKey.readLine();
    dtout = new PrintStream(sc_cliente.getOutputStream());
    dtout.println(salida);
    String entrada = bufferIn.readLine();
        System.out.println("datos entrada del cliente" +  entrada);
        bufferIn.close();
        dtout.close();
        bufferKey.close();
        sc_cliente.close();
    }
}
