package try_catch;


import java.util.Scanner;

public class Bus {
    String placa;
    int capacidadPasajeros, pasajerosActuales, totalPasajeros, contador = 0;
    double precioPasaje, dineroAcumulado;
                
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

    public double getDineroAcumulado() {
        
        return dineroAcumulado;
    }
   
                // fin get - inicio constructores

    public Bus() {
    }

    public Bus(String placa, int capacidadPasajeros, int pasajerosActuales, int totalPasajeros, double precioPasaje, double dineroAcumulado) {
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.pasajerosActuales = pasajerosActuales;
        this.totalPasajeros = totalPasajeros;
        this.precioPasaje = precioPasaje;
        this.dineroAcumulado = dineroAcumulado;
    }
    
                   // fin constructores
    
    public void Bus(String placa, int capacidad, double psaje){
    
    }
    
    public void subirPasajeros (){
        
        int pasajeros; 
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("ingrese el numero de pasajeros que se subieron al bus: ");
        pasajeros = entrada1.nextInt();
        
        pasajerosActuales = pasajeros + pasajerosActuales;
        if (pasajerosActuales > capacidadPasajeros){
            System.out.println("sobrecupo de pasajeros");
            pasajerosActuales =  pasajerosActuales - pasajeros ;
            System.out.println("el numero actual de pasajeros es: " + pasajerosActuales);
        }else {
            System.out.println("el numero actual de pasajeros es: " + pasajerosActuales);
           // contador = pasajerosActuales;
        }
            //System.out.println("contador: " + contador);
        
    }
    // funcion para vajar el numero de pasajeros del bus
    public void vajarPasajeros (){
        int pasajeros;
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("ingrese el numero de pasajeros que se vajaron del bus: ");
        pasajeros = entrada1.nextInt();
       
        pasajerosActuales = pasajerosActuales - pasajeros ;
        if (pasajerosActuales < 0){
            System.out.println("error (bjaron mas pasajeros de los que habian)");
            pasajerosActuales = pasajerosActuales + pasajeros;
            System.out.println("el numero de pasajeros es: " + pasajerosActuales);
        }else {
            System.out.println("el numero actual de pasajeros es: " + pasajerosActuales);
             
        }
    }
}
