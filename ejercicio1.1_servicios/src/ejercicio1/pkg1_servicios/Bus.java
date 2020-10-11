package ejercicio1.pkg1_servicios;

import java.util.Scanner;

public class Bus {
    String placa;
    int capacidadPasajeros, pasajerosActuales, totalPasajeros, contador, precioPasaje;
    double  dineroAcumulado;
                
                // inicio get

    public String getPlaca() {
        return placa;
    }
     
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public double getPrecioPasaje() {
        return precioPasaje;
    }

    public int getContador() {
        return contador;
    }
    
   
                // fin get - inicio constructores

    public Bus() {
    }

    public Bus(String placa, int capacidadPasajeros, int pasajerosActuales, int totalPasajeros, int precioPasaje, double dineroAcumulado) {
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.pasajerosActuales = pasajerosActuales;
        this.totalPasajeros = totalPasajeros;
        this.precioPasaje = precioPasaje;
        this.dineroAcumulado = dineroAcumulado;
    }
    
                   // fin constructores
    
   // public void Bus(String placa, int capacidad, double psaje){
    
   // }
    
    public void subirPasajeros (){
        
        int pasajeros; 
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("          ingrese el numero de pasajeros que se subieron al bus: ");
        pasajeros = entrada1.nextInt();
        contador = pasajeros + contador;
        pasajerosActuales = pasajeros + pasajerosActuales;
        
        if (pasajerosActuales > capacidadPasajeros){
            System.out.println("          sobrecupo de pasajeros");
            pasajerosActuales =  pasajerosActuales - pasajeros ;
            System.out.println("          el numero actual de pasajeros es: " + pasajerosActuales);
        }else {
            System.out.println("          el numero actual de pasajeros es: " + pasajerosActuales);
            
        }
            
        
       
    }
    // funcion para vajar el numero de pasajeros del bus
    public void bajarPasajeros (){
        int pasajeros;
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("          ingrese el numero de pasajeros que se vajaron del bus: ");
        pasajeros = entrada1.nextInt();
       
        pasajerosActuales = pasajerosActuales - pasajeros ;
        if (pasajerosActuales < 0){
            System.out.println("          error (bajaron mas pasajeros de los que habian)");
            pasajerosActuales = pasajerosActuales + pasajeros;
            System.out.println("          el numero de pasajeros es: " + pasajerosActuales);
        }else {
            System.out.println("          el numero actual de pasajeros es: " + pasajerosActuales);
             
        }
    }
    
    public void dineroAcumulado(){
    int dinero;
    dinero = contador * precioPasaje;
     System.out.println("          el dinero es: " + dinero);
    }
   
}
