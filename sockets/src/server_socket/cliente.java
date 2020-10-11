package server_socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class cliente {
    private ServerSocket sc_server; 
    private Socket sc_cliente;
    private BufferedReader buffer;
    private DataOutputStream dtout;
    private  int puerto;
    private String mensaje;

    public cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    public void iniciar_conexion() throws IOException{
        
    sc_server = new ServerSocket(puerto);
    sc_cliente = new Socket();
    sc_cliente = sc_server.accept();
    buffer = new BufferedReader (new InputStreamReader(sc_cliente.getInputStream()));
    String datosBuffer = buffer.readLine();
    System.out.println("mensaje de entrada" + datosBuffer);
       
    dtout.close();
    buffer.close();
    sc_server.close();
    sc_server.close();
        System.out.println("FIN de la conexion");
    
    } 
}
