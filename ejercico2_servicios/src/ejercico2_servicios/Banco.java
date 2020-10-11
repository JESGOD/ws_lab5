package ejercico2_servicios;

import static java.time.Clock.system;
import java.util.Scanner;


public class Banco {
String nombre;
cliente clientes[] = new cliente[100];
int numeroDeClientes;


///////////// contructor ///////////////
    
public Banco(String nombre) {
        this.nombre = nombre;
}

////////// fin constructor ///////////
    public String obtNombre(){
    return nombre;
    
    }
    public void cambiarNombre(String nombreb){
    nombre = nombreb;
    }
 ////////////////////////////////////////
     
    public void adCliente(){
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        String datosUsuario;
        int option, agUsuarios, i = 0, contador = 0, contador2 = 0;
        
        do{
            System.out.println("********** 1: agregar ususario **********");
            System.out.println("********** 2: salir **********");
            option = entrada1.nextInt();
            switch(option){
                case 1:
            
                    System.out.println("********** cuantos usuarios desea agregar? **********");
                    agUsuarios = entrada1.nextInt();
                 //  if (i == 0){ i = 1  2 + 1
                        for( i = 0; i < agUsuarios; i++){
                            contador = i +1;
                            
                            System.out.println("          usuario numero: " + contador);
                            clientes[i] = new cliente("","","","");
                            System.out.println("          Ingrese el nombre del cliente: ");
                            datosUsuario = entrada2.nextLine();
                            clientes[i].setNombre(datosUsuario);
                            System.out.println("          Ingrese el apellido del cliente: ");
                            datosUsuario = entrada2.nextLine();
                            clientes[i].setApellido(datosUsuario);
                            System.out.println("          Ingrese la edad: ");
                            datosUsuario = entrada2.nextLine();
                            clientes[i].setEdad(datosUsuario);
                            System.out.println("          Ingrese el genero: ");
                            datosUsuario = entrada2.nextLine();
                            clientes[i].setGenero(datosUsuario);
                            System.out.println("********** tipo de cliente ? ********** ");
                            clientes[i].tipoDeCliente = clientes[i].defineTipoCliente();
                            numeroDeClientes++;
                        }
                /*   }else {
                     
                        for( int j = i; j < agUsuarios + i; j++){
                        
                            System.out.println("usuario numero: " + j);
                            clientes[j] = new cliente("n","a","g","21");
                            clientes[j].tipoDeCliente = clientes[j].defineTipoCliente();
                            clientes[j].getTipoDeIdentificacion();
                            System.out.println("tipo cliente es : " + clientes[j].getTipoDeCliente());
                            System.out.println("tipo cliente es : " + clientes[j].getTipoDeIdentificacion());
                
                        }
                    }*/
                    break;
                case 2:
                    break;
            }
        }while(option != 2);
    }
 /////////////////////////////////////////////   
    public int obtNumCliente (){
        return numeroDeClientes ;
    
    }
     public cliente obtCliente(int posicion){
        
        return  clientes[posicion];
    
    }
    public cliente[] obtClientes(){
        return clientes;
     
     }
}
