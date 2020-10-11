package ejercico2_servicios;

import java.util.Scanner;

public class Ejercico2_servicios {
    
    public static void main(String[] args) {
        int option, numClientes;
        String newNombre, nombreB;
        cliente newcliente = new cliente("","","","");
        cliente clientes2[] = new cliente[100];
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Banco banco1 = new Banco("BBVA"); 
       
        do{
            System.out.println("********** 1: obtener nombre del banco ");
            System.out.println("********** 2: cambiar nombre del banco ");
            System.out.println("********** 3: añadir clientes ");
            System.out.println("********** 4: obtener numero de clientes registrados ");
            System.out.println("********** 5: obtener informacion de un cliente ");
            System.out.println("********** 6: obtener la informacion de todos lo clientes ");
            option = entrada1.nextInt();
            switch(option){
                case 1:
                    nombreB = banco1.obtNombre();
                    System.out.println("          el nombre del banco es: "  + nombreB);
                break;
                case 2: 
                    System.out.println("          digite el nuevo nombre del banco: ");
                    newNombre = entrada2.nextLine();
                    banco1.cambiarNombre(newNombre);
                break;
                case 3: 
                    banco1.adCliente();
                break;
                case 4: 
                
                    numClientes = banco1.obtNumCliente();
                    System.out.println("          el numero de clientes registrados es: " + numClientes);
                break;
                case 5:
                    System.out.println("********** por favor elija el cliente del cual desea ver la informacion: "); 
                    System.out.println("           cliente 0: "); 
                    System.out.println("           cliente 1: "); 
                    System.out.println("           cliente 2: "); 
                    System.out.println("           cliente 3: "); 
                    System.out.println("           cliente 4: ");
                    System.out.println("           cliente 5: "); 
                    int opt = entrada1.nextInt();
                    newcliente = banco1.obtCliente(opt);  
                    System.out.println("          el nombre del cliente es: " + newcliente.getNombre());
                    System.out.println("          el apellido del cliente es: " + newcliente.getApellido());
                    System.out.println("          el genero del cliente es: " + newcliente.getGenero());
                    System.out.println("          la edad del cliente es: " + newcliente.getEdad());
                    System.out.println("          el tipo de identificacion del cliente es: " + newcliente.getTipoDeIdentificacion());
                    System.out.println("          el tipo de cliente es: " + newcliente.getTipoDeCliente());
                break;
                case 6:
                    clientes2 = banco1.obtClientes();
                    int t = clientes2.length;
                    for (int i = 0; i <= t; i++){
                        System.out.println(" ******** cliente: " + i + "************");  
                        System.out.println("          el nombre es : " + clientes2[i].getNombre());
                        System.out.println("          el apellido es : " + clientes2[i].getApellido());
                        System.out.println("          la edad es : " + clientes2[i].getEdad());
                        System.out.println("          el genero es : " + clientes2[i].getGenero());
                        System.out.println("          tipo cliente es : " + clientes2[i].getTipoDeCliente());
                        System.out.println("          tipo de documento : " + clientes2[i].getTipoDeIdentificacion() + "\n");
                    }
                break;
                case 7:
                break;
            }
        }while(option != 7);
    }

}
