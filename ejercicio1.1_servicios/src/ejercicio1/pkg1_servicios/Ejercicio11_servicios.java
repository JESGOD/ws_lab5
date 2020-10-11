package ejercicio1.pkg1_servicios;

import java.util.Scanner;

public class Ejercicio11_servicios {

    
    public static void main(String[] args) {
        int option;
        Scanner entrada = new Scanner(System.in);
        Bus bus1 = new Bus("AS-123", 15, 0, 0, 1100, 0);
       
        do {
            System.out.println("********** ingrese una opcion: \n");
            System.out.println("********** 1: subir pasajero");
            System.out.println("********** 2: bajar pasajero");
            System.out.println("********** 3: obtener placa");
            System.out.println("********** 4: obtener capacidad");
            System.out.println("********** 5: obtener numero de pasajeros en el bus");
            System.out.println("********** 6: numero de pasajeros que se han suvido");
            System.out.println("********** 7: obtener valor del pasaje");
            System.out.println("********** 8: obtener dinero total");
            System.out.println("********** 9: salir");
            
            
            option = entrada.nextInt();
            switch(option){
                case 1:
                    bus1.subirPasajeros();
                    break;
                    
                case 2: 
                    bus1.bajarPasajeros();
                    break;
                    
                case 3:
                    System.out.println("          el numero de placa es: " + bus1.getPlaca() + "\n");
                    break;
  
                case 4:
                    System.out.println("          la capacidad del bus es: " + bus1.getCapacidadPasajeros() + "\n");
                    break;
                     
                case 5:  
                    System.out.println("          el numero de pasajeros actuales es: " + bus1.getPasajerosActuales() + "\n");
                    break;
                    
                case 6:
                   System.out.println("          el numero de pasajeros que se han subido es: " + bus1.getContador() + "\n");
                    break;
                    
                case 7:
                    System.out.println("          el valor del pasaje es: " + bus1.getPrecioPasaje() + "\n");
                    break;
                    
                case 8:
                   bus1.dineroAcumulado();
                    
                    break;
                    
                case 9:
                    break;
            }
         
        }while (option != 9);
        
        
    }
    
}
